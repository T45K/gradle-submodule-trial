/*
 * This Kotlin source file was generated by the Gradle "init" task.
 */
package io.github.t45k.gradle.submodule.trial.app

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.assertEquals

class MessageUtilsTest {
    @Test fun testGetMessage() {
        assertEquals("Hello      World!", MessageUtils.getMessage())
    }
}
