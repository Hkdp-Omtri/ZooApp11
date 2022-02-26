//
//  ViewController.swift
//  Mangina_SearchApp
//
//  Created by JayaShankar Mangina on 10/6/21.
//

import UIKit

class ViewController: UIViewController {
    
    var imgArray = [ [ #imageLiteral(resourceName: "appleSteveJobs"), #imageLiteral(resourceName: "appleiDevices"), #imageLiteral(resourceName: "ApplePark"), #imageLiteral(resourceName: "apple"), #imageLiteral(resourceName: "appleStore")],
                     [ #imageLiteral(resourceName: "jamesbondSeanConnery"), #imageLiteral(resourceName: "jamesBondPierceBrosnon"), #imageLiteral(resourceName: "jamesBondAstonDb11"), #imageLiteral(resourceName: "jamesBondFlight"), #imageLiteral(resourceName: "jamesBondDanielCraig")],
                     [ #imageLiteral(resourceName: "marvel"), #imageLiteral(resourceName: "marvelInfinityWar"), #imageLiteral(resourceName: "marvelIronman"), #imageLiteral(resourceName: "marvelThor"), #imageLiteral(resourceName: "marvelCivilWar")],
                     [ #imageLiteral(resourceName: "seattleChihuly"), #imageLiteral(resourceName: "seattleSpaceNeedle"), #imageLiteral(resourceName: "seattleAmazon"), #imageLiteral(resourceName: "seattleAquarium"), #imageLiteral(resourceName: "seattleDowntown")],
                     [ #imageLiteral(resourceName: "tvShowSiliconValley"), #imageLiteral(resourceName: "tvShowLucifer"), #imageLiteral(resourceName: "tvShowTheBigBangTheory"), #imageLiteral(resourceName: "tvShowRickAndMorty"), #imageLiteral(resourceName: "tvShowMrRobot")] ]
    
    var emptySearchImage =  #imageLiteral(resourceName: "NotFound.jpg")
    
    var wordEntered:String = ""
    
    var apple_keywords = ["Jobs","devices","park","apple","store"]
    var jamesbond_keywords = ["sean","brosnon","aston","flight","daniel"]
    var marvel_keywords = ["ironman","thor","marvel","civilwar","infinitywar"]
    var seattle_keywords = ["chihuly","needle","downtown","aquarium","skyline"]
    var tvshows_keywords = ["siliconvalley","lucifer","bigbang","rick","robot"]
    
    let apple_keywords_Desc = [ ["Former Apple CEO. Famously known as Innovator, Marketing Genius. He's the Big brain behind the apple devices iPhone, iPad, iMac, iPod. His innovations and thoughts were the pillars and laid a foundation to the present day Apple Incorporation"],["Family of Apple Devices. Also called by the name 'Apple EcoSystem'"],["Apple Park. the Headquarters of Apple Incorporation. It is one of the expensive infrastructures in present day world. The cost is 5 Billion $."],["Apple Logo. The Brand. The Power. An iconic Logo"],["Apple Store - A place where one can buy apple products in-person. This apple store in singapore has built on water, making it the first floating store in the world"] ]
    
    let jamesbond_keywords_desc = [ ["The First James Bond. Played 5 james Bond movies. One of the best actors in the world."],["The Handsome James Bond in James Bond Moves History"],["Most Iconic Super car used in the james bond movies."],["This scene stands highlight in Spectre Movie"],["Most played Bond character since casino royale movie. His Last movie is 'No time to Die' which was released recently."] ]
    
    let marvel_keywords_desc = [ ["Logo of Marvel Studios Company"],["Poster of Avengers: Infinity war"],["The First Movie in the Marvel cinematic Universe. Played by most iconic actor Robert Downey Jr."],["The God of Thunder. Most Powerful Hero in MCU."],["The movie rotates around two characters : Tony Stark & Captain America. Split over the creative differences between Tony Stark (Iron Man) & Steve Rogers (Captain America), the Avengers forms into two teams namely: Team IronMan and Team Captain America, which later leads to clashes between the avengers themselves. "],["A MegaloManiac, who's Power Starving to take control over the Universe - the most dubious Villain 'Thanos' captures all the Six Infinity Stones and wipes half of the universe population"] ]
    
    let seattle_keywords_desc = [ ["Chihuly Garden and Glass is an exhibit in the Seattle Center directly next to the Space Needle, showcasing the studio glass of Dale Chihuly. It opened in May 2012 at the former site of the defunct Fun Forest amusement park."],["Iconic, 605-ft.-tall spire at the Seattle Center, with an observation deck & a rotating restaurant."],["The heart of Seattle is well-stocked with world-class dining, cultural attractions, and unique finds"],["The Seattle Aquarium is a public aquarium in Seattle, Washington, United States, located on Pier 59 on the Elliott Bay waterfront. It opened in 1977 and has been accredited by the Association of Zoos and Aquariums."],["The Seattle skyline view, with a dominate Mount Rainier from Lake Union - Seattle, Washington Space Needle thrust skyward and Mount Rainier seeming to float in the distance, highlights one of the most recognized city scenes in the world."] ]
    
    let tvshows_keywords_desc = [ ["Partially inspired by co-creator Mike Judge's experiences as a Silicon Valley engineer in the 1980s, this comedy series follows the misadventures of introverted computer programmer Richard and his brainy friends as they attempt to strike it rich in a high-tech gold rush."],["This series follows Lucifer, the original fallen angel, who has become dissatisfied with his life in hell. After abandoning his throne and retiring to Los Angeles, Lucifer indulges in his favorite things (women, wine and song) -- until a murder takes place outside of his upscale nightclub. For the first time in billions of years, the murder awakens something unfamiliar in Lucifer's soul that is eerily similar to compassion and sympathy"],["Mensa-fied best friends and roommates Leonard and Sheldon, physicists who work at the California Institute of Technology, may be able to tell everybody more than they want to know about quantum physics, but getting through most basic social situations, especially ones involving women, totally baffles them."],["After having been missing for nearly 20 years, Rick Sanchez suddenly arrives at daughter Beth's doorstep to move in with her and her family. Although Beth welcomes Rick into her home, her husband, Jerry, isn't as happy about the family reunion. Jerry is concerned about Rick, a sociopathic scientist, using the garage as his personal laboratory."],["Young, anti-social computer programmer Elliot works as a cybersecurity engineer during the day, but at night he is a vigilante hacker. He is recruited by the mysterious leader of an underground group of hackers to join their organization. Elliot's task? Help bring down corporate America, including the company he is paid to protect, which presents him with a moral dilemma."] ]
    
    var i:Int = 0

    @IBOutlet weak var searchButtonOutlt: UIButton!
    @IBOutlet weak var searchTextField: UITextField!
    @IBOutlet weak var resultImage: UIImageView!
    @IBOutlet weak var showMoreImagesBtnOutlt: UIButton!
    @IBOutlet weak var topicInfoText: UITextView!
    @IBOutlet weak var resetButtonOutlt: UIButton!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        resultImage.image = emptySearchImage
        showMoreImagesBtnOutlt.isHidden = true
        resetButtonOutlt.isHidden = true
        topicInfoText.text = ""
    }

    @IBAction func searchButtonAction(_ sender: UIButton) {
        wordEntered = searchTextField.text!
        if wordEntered.contains("Jobs") || wordEntered.contains("devices") || wordEntered.contains("park") || wordEntered.contains("apple") || wordEntered.contains("store") {
            i = 0
            showMoreImagesBtnOutlt.backgroundColor = .systemBlue
            showMoreImagesBtnOutlt.isHidden = false
            showMoreImagesBtnOutlt.isEnabled = true
            resetButtonOutlt.isHidden = false
            resultImage.image = imgArray[0][i]
            topicInfoText.text = apple_keywords_Desc[i][0]
            searchTextField.text! = ""
        }else if wordEntered.contains("sean") || wordEntered.contains("brosnon") || wordEntered.contains("aston") || wordEntered.contains("flight") || wordEntered.contains("daniel") {
            i = 0
            showMoreImagesBtnOutlt.backgroundColor = .systemBlue
            showMoreImagesBtnOutlt.isHidden = false
            showMoreImagesBtnOutlt.isEnabled = true
            resetButtonOutlt.isHidden = false
            resultImage.image = imgArray[1][i]
            topicInfoText.text = jamesbond_keywords_desc[i][0]
            searchTextField.text! = ""
        }else if wordEntered.contains("ironman") || wordEntered.contains("thor") || wordEntered.contains("marvel") || wordEntered.contains("civilwar") || wordEntered.contains("infinitywar") {
            i = 0
            showMoreImagesBtnOutlt.backgroundColor = .systemBlue
            showMoreImagesBtnOutlt.isHidden = false
            showMoreImagesBtnOutlt.isEnabled = true
            resetButtonOutlt.isHidden = false
            resultImage.image = imgArray[2][i]
            topicInfoText.text = marvel_keywords_desc[i][0]
            searchTextField.text! = ""
        }else if wordEntered.contains("chihuly") || wordEntered.contains("needle") || wordEntered.contains("downtown") || wordEntered.contains("aquarium") || wordEntered.contains("skyline") {
            i = 0
            showMoreImagesBtnOutlt.backgroundColor = .systemBlue
            showMoreImagesBtnOutlt.isHidden = false
            showMoreImagesBtnOutlt.isEnabled = true
            resetButtonOutlt.isHidden = false
            resultImage.image = imgArray[3][i]
            topicInfoText.text = seattle_keywords_desc[i][0]
            searchTextField.text! = ""
        }else if wordEntered.contains("siliconvalley") || wordEntered.contains("lucifer") || wordEntered.contains("bigbang") || wordEntered.contains("rick") || wordEntered.contains("robot") {
            i = 0
            showMoreImagesBtnOutlt.backgroundColor = .systemBlue
            showMoreImagesBtnOutlt.isHidden = false
            showMoreImagesBtnOutlt.isEnabled = true
            resetButtonOutlt.isHidden = false
            resultImage.image = imgArray[4][i]
            topicInfoText.text = tvshows_keywords_desc[i][0]
            searchTextField.text! = ""
        }else{
            topicInfoText.text = ""
            resultImage.image = emptySearchImage
            showMoreImagesBtnOutlt.isHidden = true
            resetButtonOutlt.isHidden = true
        }
        
    }
    
    @IBAction func showMoreImagesBtnAction(_ sender: UIButton) {
        
        if i < imgArray.count{
            if wordEntered == "Jobs" || wordEntered == "devices" || wordEntered == "park" || wordEntered == "apple" || wordEntered == "store" {
                resultImage.image = imgArray[0][i+1]
                topicInfoText.text = apple_keywords_Desc[i+1][0]
                showMoreImagesBtnOutlt.backgroundColor = .systemBlue
                resetButtonOutlt.isEnabled = true
                resetButtonOutlt.isHidden = false
                i += 1
            }else if wordEntered == "sean" || wordEntered == "brosnon" || wordEntered == "aston" || wordEntered == "flight" || wordEntered == "daniel" {
                resultImage.image = imgArray[1][i+1]
                topicInfoText.text = jamesbond_keywords_desc[i+1][0]
                showMoreImagesBtnOutlt.backgroundColor = .systemBlue
                resetButtonOutlt.isEnabled = true
                resetButtonOutlt.isHidden = false
                i += 1
            }else if wordEntered == "ironman" || wordEntered == "thor" || wordEntered == "marvel" || wordEntered == "civilwar" || wordEntered == "infinitywar" {
                resultImage.image = imgArray[2][i+1]
                topicInfoText.text = marvel_keywords_desc[i+1][0]
                showMoreImagesBtnOutlt.backgroundColor = .systemBlue
                resetButtonOutlt.isEnabled = true
                resetButtonOutlt.isHidden = false
                i += 1
            }else if wordEntered == "chihuly" || wordEntered == "needle" || wordEntered == "downtown" || wordEntered == "aquarium" || wordEntered == "skyline" {
                resultImage.image = imgArray[3][i+1]
                topicInfoText.text = seattle_keywords_desc[i+1][0]
                showMoreImagesBtnOutlt.backgroundColor = .systemBlue
                resetButtonOutlt.isEnabled = true
                resetButtonOutlt.isHidden = false
                i += 1
            }else if wordEntered == "siliconvalley" || wordEntered == "lucifer" || wordEntered == "bigbang" || wordEntered == "rick" || wordEntered == "robot" {
                resultImage.image = imgArray[4][i+1]
                topicInfoText.text = tvshows_keywords_desc[i+1][0]
                showMoreImagesBtnOutlt.backgroundColor = .systemBlue
                resetButtonOutlt.isEnabled = true
                resetButtonOutlt.isHidden = false
                i += 1
            }
        }
        
        if i == imgArray.count-1{
            showMoreImagesBtnOutlt.isEnabled = false
            showMoreImagesBtnOutlt.backgroundColor = .systemGray
        }
    }
    
    @IBAction func enterSearchFieldChanged(_ sender: UITextField) {
        var textEntered = searchTextField.text!
        textEntered = String(textEntered)
        searchTextField.text = textEntered
        
        if textEntered.isEmpty {
            searchButtonOutlt.isEnabled = false
        }else{
            searchButtonOutlt.isEnabled = true
        }
        
    }
    
    @IBAction func resetButtonOnTap(_ sender: UIButton) {
        searchButtonOutlt.isHidden = true
        searchTextField.isHidden = true
        showMoreImagesBtnOutlt.isHidden = true
        topicInfoText.text = ""
        resultImage.image = emptySearchImage
        i = 0
        wordEntered = ""
        
    }
    
    
}

