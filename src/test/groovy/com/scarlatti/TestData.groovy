package com.scarlatti

import com.scarlatti.model.Basket
import com.scarlatti.model.Ingredient
import com.scarlatti.model.Sandwich

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Saturday, 9/29/2018
 */
class TestData {

    static basketWithTwoSandwiches() {
        new Basket(
                sandwiches: [
                        new Sandwich(
                                ingredients: [
                                        new Ingredient(name: "lettuce"),
                                        new Ingredient(name: "tomato")
                                ]
                        ),
                        new Sandwich(
                                ingredients: [
                                        new Ingredient(name: "cheese"),
                                        new Ingredient(name: "pretzels")
                                ]
                        )
                ]
        )
    }
}