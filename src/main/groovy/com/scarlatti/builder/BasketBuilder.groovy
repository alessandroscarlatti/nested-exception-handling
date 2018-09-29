package com.scarlatti.builder

import com.scarlatti.model.Basket
import com.scarlatti.model.Sandwich

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Saturday, 9/29/2018
 */
class BasketBuilder {

    private Basket basket

    BasketBuilder(Basket basket) {
        this.basket = basket
    }

    /**
     * @return a string that represents the basket.  For example,
     * basket with sandwich with ingredient lettuce with ingredient tomato with sandwich...etc.
     */
    String build() {
        StringBuilder string = new StringBuilder("basket")
        for (Sandwich sandwich : basket.sandwiches) {
            SandwichBuilder sandwichBuilder = new SandwichBuilder(sandwich)
            string.append(sandwichBuilder.build())
        }
        return string.toString()
    }
}
