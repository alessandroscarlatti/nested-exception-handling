package com.scarlatti

import com.scarlatti.builder.BasketBuilder
import com.scarlatti.model.Basket
import org.junit.Test

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Saturday, 9/29/2018
 */
class BasketBuilderTest {

    @Test
    void buildBasket() {
        Basket basket = TestData.basketWithTwoSandwiches()

        BasketBuilder builder = new BasketBuilder(basket)
        String string = builder.build()

        assert string != null
        println string
    }
}
