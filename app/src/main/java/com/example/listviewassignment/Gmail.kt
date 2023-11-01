package com.example.listviewassignment

class Gmail {
    var account: String = ""
    var title: String = ""
    var content: String = ""
    var time: String = ""
    var isMark: Boolean = false
    var logoPath: String = ""

    constructor(account: String, title: String, content: String, time: String, isMark: Boolean, logoPath: String){
        this.account = account
        this.title = title
        this.content = content
        this.time = time
        this.isMark = isMark
        this.logoPath = logoPath
    }
}