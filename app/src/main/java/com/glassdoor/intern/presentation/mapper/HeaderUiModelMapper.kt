/*
 * Copyright (c) 2025, Glassdoor Inc.
 *
 * Licensed under the Glassdoor Inc Hiring Assessment License.
 * You may not use this file except in compliance with the License.
 * You must obtain explicit permission from Glassdoor Inc before sharing or distributing this file.
 * Mention Glassdoor Inc as the source if you use this code in any way.
 */

package com.glassdoor.intern.presentation.mapper

import com.glassdoor.intern.domain.model.HeaderInfo
import com.glassdoor.intern.presentation.model.HeaderUiModel
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import javax.inject.Inject

internal class HeaderUiModelMapper @Inject constructor(
    private val itemUiModelMapper: ItemUiModelMapper
) {

    // DONE: Define date formatting pattern
    private val dateFormatter: DateTimeFormatter =
        DateTimeFormatter.ofPattern("MMM dd, yyyy HH:mm").withZone(ZoneId.systemDefault())

    // DONE: Convert domain model to UI model
    fun toUiModel(headerInfo: HeaderInfo): HeaderUiModel = with(headerInfo) {
        HeaderUiModel(
            title = title,
            description = description,
            timestamp = formatTimestamp(timestamp),
            items = items.map { item ->
                itemUiModelMapper.toUiModel(item)
            },
        )
    }

    private fun formatTimestamp(timestamp: String): String {
        return try {
            val instant = Instant.parse(timestamp)
            dateFormatter.format(instant)
        } catch (e: Exception) {
            "Invalid Date"
        }
    }
}
