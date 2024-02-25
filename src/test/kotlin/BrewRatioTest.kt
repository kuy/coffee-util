package net.endflow

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.equals.shouldBeEqual

class BrewRatioTest : FunSpec({
    context("testing forRatio") {
        test("should return BrewRatio") {
            val actual = BrewRatioFactory.forRatio(14.0, 238.0)
            actual.ratio shouldBeEqual 17.0
        }
    }
})
