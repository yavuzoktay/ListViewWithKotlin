package com.yavuzoktay.listviewwithkotlin

/**
 * Created by Yavuz on 12.12.2017.
 */
class User{
    var name : String =""
    var comment: String =""


    constructor(){

    }

    constructor(name: String, comment: String) {
        this.name = name
        this.comment = comment
    }


}

