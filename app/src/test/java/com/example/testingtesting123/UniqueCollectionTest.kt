package com.example.testingtesting123

import org.junit.Before
import org.junit.Test
//import equals test
import org.junit.Assert.assertEquals

class UniqueCollectionTest {

    lateinit var collection: UniqueCollection

    @Before
    fun setUp() {
        collection = UniqueCollection()
    }


    // TODO 1: Write a test to ensure items can be added to the collection
    @Test
    fun addAnItem() {
        val testItemOne = Item("John")
        val testItemTwo = Item("Steven")
        val testItemThree = Item("Joseph")

        //add items and test
        collection.addItem(testItemOne)
        assertEquals(1, collection.size())
        collection.addItem(testItemTwo)
        assertEquals(2, collection.size())
        collection.addItem(testItemThree)
        assertEquals(3, collection.size())

    }

    // TODO 2: Write a test to ensure that only unique items can be added to the collection
    // Uniqueness is determined by the Item.name property, which is set via the constructor
    @Test
    fun addUniqueItem() {
        val testItemOne = Item("John")
        collection.addItem(testItemOne)
        assertEquals(1, collection.size())

        val testItemOneDup = Item("John")
        collection.addItem(testItemOneDup)
        assertEquals(1, collection.size())
    }

    // Test Driven Development (TDD) test - complete specified function so that this test passes
    @Test
    fun clearAllItems() {
        collection.addItem(Item("item1"))
        collection.addItem(Item("Item2"))

        val originalSize = collection.size()
        collection.clear()
        val newSize = collection.size();

        assert(originalSize == 2 && newSize == 0) {"Items not cleared"}
    }
}