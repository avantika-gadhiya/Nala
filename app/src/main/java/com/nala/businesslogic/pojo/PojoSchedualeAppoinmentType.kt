package com.nala.businesslogic.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class PojoSchedualeAppoinmentType:PojoCommonResponse() {

    @SerializedName("txt_type")
    @Expose
    var txt_type: String? = null
}