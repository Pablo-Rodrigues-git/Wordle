package com.studies.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    //Method name, State under test, Expected behavior
    @Test
    fun checkExistingLetters_fourExistingLettersMisplaced_true() {
        //GIVEN
        val input = "tempo"
        val secret = "potes"

        //WHEN
        val result: Boolean = WordChecker.checkExistingLetters(input, secret)

        //THEN
        assertEquals(true, result)
    }

    //Method name, Expected behavior, Stater under test
    @Test
    fun checkExistingLetters_returnTrue_WhenNotSecretDifferentCases() {
        //GIVEN
        val input = "bOteS"
        val secret = "potes"

        //WHEN
        val result: Boolean = WordChecker.checkExistingLetters(input, secret)

        //THEN
        assertEquals(true, result)
    }

    // Feature to be tested (requirement)
    @Test
    fun `wordChecker should not distinguish between uppercase and lowercase, when input and secret are equals`() {
        //GIVEN
        val input = "PotEs"
        val secret = "potes"

        //WHEN
        val result: Boolean = WordChecker.checkExistingLetters(input, secret)

        //THEN
        assertEquals(true, result)
    }

    // Should expected behavior, when, Stater under test
    @Test
    fun `Should return true, when input and secret are equals, including case`() {
        //GIVEN
        val input = "potes"
        val secret = "potes"

        //WHEN
        val result: Boolean = WordChecker.checkExistingLetters(input, secret)

        //THEN
        assertEquals(true, result)
    }

}
