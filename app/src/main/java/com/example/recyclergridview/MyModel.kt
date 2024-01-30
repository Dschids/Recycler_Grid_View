package com.example.recyclergridview

/*
MyModel accepts an image in the form of an Int and text in a string and creates a class object
basically just to hold the information from all the different images/text
 */
class MyModel {
    var iconsCard: Int?
    var iconsText: String

    constructor(iconsCard: Int?, iconsText: String){
        this.iconsCard = iconsCard
        this.iconsText = iconsText
    }
}