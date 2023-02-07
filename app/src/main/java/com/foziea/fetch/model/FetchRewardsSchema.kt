package com.foziea.fetch.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class FetchRewardsItem(
    val id: String = "",
    val listId: String = "",
    val name: String = ""
): Parcelable
