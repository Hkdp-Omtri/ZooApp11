//
//  GrocerySections.swift
//  Merugu_GroceryApp
//
//  Created by Student on 4/11/22.
//

import Foundation
struct Grocery {
var section = ""
var items_Array:[GroceryItem] = []
}

struct GroceryItem{
    var itemName = ""
    var itemImage = ""
    var itemInfo = ""
}

let groceryitem1 = Grocery(section:"Meat & SeaFood",items_Array:[GroceryItem(itemName:"chicken",itemImage:"m1",itemInfo:""), GroceryItem(itemName: "mutton", itemImage: "m2", itemInfo: ""), GroceryItem(itemName: "fish", itemImage: "m3", itemInfo: ""), GroceryItem(itemName: "prawns", itemImage: "m4", itemInfo: "")] )

let groceryitem2 = Grocery( section: "Pantry", items_Array: [GroceryItem(itemName: "Corn", itemImage: "p1", itemInfo: ""), GroceryItem(itemName: "Beans", itemImage: "p2", itemInfo: ""), GroceryItem(itemName: "Carrots", itemImage: "p3", itemInfo: ""), GroceryItem(itemName: "Canned foods", itemImage: "p4", itemInfo: "")] )

let groceryitem3 = Grocery( section: "Beverages", items_Array: [GroceryItem(itemName: "Wine", itemImage: "b1", itemInfo: " "), GroceryItem(itemName: "water", itemImage: "b2", itemInfo: " "), GroceryItem(itemName: "coke", itemImage: "b3", itemInfo: ""), GroceryItem(itemName: "red bull", itemImage: "b4", itemInfo: "")] )

let groceryitem4 = Grocery( section: "Frozen Food", items_Array: [GroceryItem(itemName: "strawberries", itemImage: "fr1", itemInfo: ""), GroceryItem(itemName: "Peaches", itemImage: "fr2", itemInfo: ""), GroceryItem(itemName: "", itemImage: "b3", itemInfo: "Coffee beans are produced in at least 70 countries around the world, and many people drink coffee several times a day. It is mostly enjoyed hot, but iced coffee is also very popular, especially in the summer. Just like tea leaves, coffee beans come from an evergreen shrub."), GroceryItem(itemName: "Orange juice", itemImage: "b4", itemInfo: "Orange juice is the most popular of all the fruit juices. Many people enjoy buying orange juice that is made from concentrate, but some prefer squeezing fresh oranges to make their own orange juice. This delicious beverage is a high source of vitamin C."), GroceryItem(itemName: "Beer", itemImage: "b5", itemInfo: "Beer is the most popular alcoholic beverage in the world, and it can be enjoyed for any occasion. This refreshing fermented beverage has probably been around since prehistoric times, and it is definitely here to stay as it is being consumed in every country around the world.")] )

let groceryitem5 = Grocery( section: "Fresh Produce", items_Array: [GroceryItem(itemName: "Casual", itemImage: "c1", itemInfo: "Casual style is what you might wear on the weekend. Think jeans, comfortable T-shirts, and sneakers or flat boots. Both streetwear and sporty style might be considered types of casual styles, but casual style can also lean preppy or hip."), GroceryItem(itemName: "Streetwear", itemImage: "c2", itemInfo: "Streetwear is a casual fashion style that first became popular in the 1990s. It incorporates comfortable yet trendy clothing such as logo T-shirts and crop tops, hoodies, baggy pants, and expensive sneakers. Streetwear takes inspiration from both hip-hop and skater style, with the added element of intentional product scarcity."), GroceryItem(itemName: "Classic", itemImage: "c3", itemInfo: "Classic style is an umbrella term for a polished everyday style that incorporates elements of workwear, such as blazers, pencil skirts, and khakis. This more professional look is appropriate for the office and other settings where you want to look your best."), GroceryItem(itemName: "Sporty", itemImage: "c4", itemInfo: "Sporty style, also known as athleisure, takes elements of athletic wear, like leggings, bike shorts, and oversize sweatshirts, out of the gym and onto the streets."), GroceryItem(itemName: "Bohemian", itemImage: "c5", itemInfo: "Also known as “boho” or “boho chic,” bohemian style borrows from the 1960’s hippie aesthetic and festival culture. The style incorporates earth tones, natural fabrics and dyes, and prints and accessories from around the world. ")] )


let grocerys = [groceryitem1, groceryitem2, groceryitem3, groceryitem4, groceryitem5]
