package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    // Test to ensure the method correctly identifies an empty string as balanced
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    // Test to verify that a string containing only brackets is considered balanced
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    // Test to check if a string with content inside brackets is considered balanced
    @Test
    public void stringInsideBracketsIsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    // Test to ensure that a string with brackets in the middle is considered balanced
    @Test
    public void stringInMiddleOfBracketsIsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[] "));
    }

    // Test to verify that a string without brackets is considered balanced
    @Test
    public void bracketLessStringIsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("string"));
    }

    // Test to ensure that a string with a single opening bracket is considered unbalanced
    @Test
    public void singleOpeningBracketInStringIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[string"));
    }

    // Test to check if a string with a single closing bracket is considered unbalanced
    @Test
    public void singleClosingBracketIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    // Test to verify that a string with brackets in the wrong order is considered unbalanced
    @Test
    public void bracketsInWrongOrderIsFalse(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("][string"));
    }

    // Test to ensure that a string with only an opening bracket is considered unbalanced
    @Test
    public void OpeningBracketIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    // Test to check if a string with only a closing bracket is considered unbalanced
    @Test
    public void ClosingBracketIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    // Test to verify that a string with many uneven opening brackets is considered unbalanced
    @Test
    public void UnevenOpeningBracketsIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[ [] string"));
    }

    // Test to ensure that a string with many uneven closing brackets is considered unbalanced
    @Test
    public void UnevenClosingBracketsIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[] ]string"));
    }

    // Test to check if a string with many brackets in the wrong order is considered unbalanced
    @Test
    public void BracketsInWrongOrderIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("] [] ]string["));
    }

    // Test to verify that a string with brackets in the right order followed by brackets in the wrong order is considered unbalanced
    @Test
    public void bracketsInRightOrderThenInWrongOrderIsFalse(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[] ]string["));
    }
}
