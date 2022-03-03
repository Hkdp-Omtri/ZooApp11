//
//  ViewController.swift
//  Takkellapati_SearchApp
//
//  Created by student on 3/3/22.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var searchTextField: UITextField!
    
    @IBOutlet weak var searchOption: UIButton!

    @IBOutlet weak var resultImage: UIImageView!
    
    @IBOutlet weak var prevImage: UIButton!
    
    @IBOutlet weak var nextImage: UIButton!
    
    @IBOutlet weak var topicinfoText: UITextView!
    
    @IBOutlet weak var resetAction: UIButton!
    
    var imageNumber = 0;
    var topic: Int = -1
    var count1 : Int = -1
    var arr = [
               ["car1","car2","car3","car4","car5"],
               ["bike1","bike2","bike3","bike4","bike5"],
               ["movie1","movie2","movie3","movie4","movie5"]]
    
    var car_keyword = ["car","model","color","wheels"]
    var bike_keyword = ["color","bike","model","price"]
    var movie_keyword = ["movie","release date","duration","hero"]
    var topics_array = [["Though there is an assortment of brand-new and fully redesigned passenger cars hitting the road for 2020 model year, their numbers are dwindling as buyers are instead choosing sport-utility vehicles as their rides of choice. ","Introducing the first vehicle we’ve ever created to be exclusively electric. Its 303-mile range will take you further. Its design and innovation will take you closer to the future.","Even in the age of next-day delivery, self-checkout, and gigabit internet, some things can't be rushed. The cars, trucks, and SUVs seen here won't reach dealer lots for anywhere from a few months to a few years. ","Generic modern SUV car in concrete garage. Car design is generic and not based on any real model or brand. 3D generated image.","To make our list, we focused on cars that are available on the market right now for under $20,000. We looked for ones that are reliable, fun to drive, comfortable."],
                        ["Volvo recently announced that it will be ceasing production of exclusively petrol and diesel powered vehicles from 2019 in favour of electric and hybrid models.","Thankfully, the world of Internet renders cares not for the limitations of reality. Just take these images: they imagine something we’ll probably never see outside of the odd weird concept - well-known car brands making bikes with styling that echoes their existing products.","Applying clutch when one slows down is necessary in the case of motorcycles. Motorbikes switched over to 4 stroke engines earlier than scooters because of stricter emission norms around the world.","The supercharged, carbon fibre 300-hp beast, was launched in 2014 and only made available to limited markets.","Next on the list of the most expensive motorbikes, is the limited edition, $68,000 dollar motorbike by CRP, The Energica Ego45."],
                        ["Steve Rogers, a rejected military soldier, transforms into Captain America after taking a dose of a Super-Soldier serum. But being Captain America comes at a price as he attempts to take down a war monger and a terrorist organization.","Avengers: Endgame is a 2019 American superhero film based on the Marvel Comics superhero team the Avengers. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, ","Two astronauts work together to survive after an accident leaves them stranded in space.","Black Panther is a 2018 American superhero film based on the Marvel Comics character of the same name. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, ","James Bond is a fictional character created by novelist Ian Fleming in 1953. A British secret agent working for MI6 under the codename 007"]]
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        searchOption.isEnabled = false
        nextImage.isHidden = true
        prevImage.isHidden = true
        resetAction.isHidden = true
        resultImage.image = UIImage(named: "default")

        //On Loading the app we need to display default Image
    }


    @IBAction func searchFieldAction(_ sender: Any) {
        searchOption.isEnabled = true
    }
    
    @IBAction func searchButtonAction(_ sender: UIButton) {
        if(car_keyword.contains(searchTextField.text!)){
            topic = 0
           
            imageNumber = 0
            buttonsDisable()
        }
        else if(bike_keyword.contains(searchTextField.text!)){
            topic = 1
            imageNumber = 0
            buttonsDisable()
        }
        else if(movie_keyword.contains(searchTextField.text!)){
            topic = 2
            imageNumber = 0;
            buttonsDisable()
        }
        else{
            topic = -1
            resultImage.image = UIImage(named: "default")
            topicinfoText.text = "No matches with the given Key words. Please try again."
            resetAction.isHidden = true
            nextImage.isHidden = true
            prevImage.isHidden = true
        }
        
        if(topic != -1)
        {
            prevImage.isEnabled = false
            nextImage.isEnabled = true
            count1 = arr[topic].count
            resultImage.image = UIImage(named: arr[topic][0])
            topicinfoText.text = topics_array[topic][0]
        }
        
    }
    
    @IBAction func ShowPrevImagesBtn(_ sender: UIButton) {
            nextImage.isEnabled = true;
            imageNumber -= 1
            resultImage.image = UIImage(named: arr[topic][imageNumber])
            topicinfoText.text = topics_array[topic][imageNumber]
            if(imageNumber == 0){
                        prevImage.isEnabled = false
                }
    
    }
    
    @IBAction func ShowNextImagesBtn(_ sender: UIButton) {
            prevImage.isEnabled = true
            imageNumber += 1
            resultImage.image = UIImage(named: arr[topic][imageNumber])
            topicinfoText.text = topics_array[topic][imageNumber]
            if(imageNumber == count1-1){
                nextImage.isEnabled = false
            }
    }
    
    @IBAction func resetButton(_ sender: Any) {
        nextImage.isHidden = true
        prevImage.isHidden = true
        resetAction.isHidden = true
        searchTextField.text = ""
        searchOption.isEnabled = false
        topicinfoText.text = ""
        resultImage.image = UIImage(named: "default")
        
    }
    func buttonsDisable(){
        nextImage.isHidden = false
        prevImage.isHidden = false
        resetAction.isHidden = false
    }
    

}

