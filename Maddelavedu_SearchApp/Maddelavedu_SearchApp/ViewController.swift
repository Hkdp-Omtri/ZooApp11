//
//  ViewController.swift
//  Maddelavedu_SearchApp
//
//  Created by Maddelavedu,Pravallika on 3/2/22.
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
    var arr = [["actor1","actor2","actor3","actor4","actor5"],
               ["cric1","cric2","cric3","cric4","cric5"],
               ["party1","party2","party3","party4","party5"]]
    
    var actors_keywords = ["actor","movie","film","hits"]
    var cricketers_keywords = ["cricketer","team","batting","style"]
    var partys_keywords = ["partyname","leader","state","symbol"]
    var topics_array = [["NTR full name is Nandamuri Tarak Ramarao and he is south indian Telugu actor.He recently acted in RRR PAN indian film.He has more hits than any hero in the industry.","BalaKrishna Nandamuri is famous telugu actor and he is son of famous Telugu Senior actor and politician Nandamuri Tarak Ramarao.","Nani is a famous telugu actor and his screen is Natural Star.He recently acted in SSR.","Ramcharan is a famous telugu actor.He recently acted in RRR PAN indian film and his father is also a famous telugu actor Chiranjeevi.","Mahesh babu is a South Indian Super star who is famous for his smartness and acting. He is the son of Telugu Super star krishna"],
        ["Yuvraj Singh is a famous Left hand Indian Cricketer and he played a key role in World cup 2011.","Rohith Sharma is a lazy star Batsmen playing for India internationally and playing for Mumbai Indians in IPL.","Virat Kohli is a famous Indian Captain and he won many matches for India.","Suresh Raina is a famous Left hand Indian Cricketer and he played a key role in World cup 2011.He is also known as Mr.IPL in IPL for his batting record.","M.S.Dhoni is also known as MSD and his Jersey No is 7. Under his captaincy India won world cup 2011."],
        ["TDP alias Telugu Desam Party is famous central party established by famous telugu  Indian actor Nandamuri Tarak ramarao. They lost in 2019 elections under the leadership of visinory leader ChandraBabu Naidu and the symbol of that party is Cycle.","YSRCP alias Yuvajana Sramika Raithu Congress Party is the ruling party in AndhraPradesh and the leader of that party is Y.S.Jagan. The symbol of this party is Fan.","Janasena Party was established by the famous telugu actor known as Power Star Pawan Kalyan. The symbol party is Star and they lost in recent 2019 elections.","BJP alias Bharatiya Janatha Party and the PM Narendra Modi ji is from this Party he won 2019 elections and won maximum seats with out allaince and formed the government in central.","Congress Party is the first central party established in India and it is ruling party in India from 1949 to 1984."]]
    
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
        if(actors_keywords.contains(searchTextField.text!)){
            topic = 0
            imageNumber = 0
            buttonsDisable()
        }
        else if(cricketers_keywords.contains(searchTextField.text!)){
            topic = 1
            imageNumber = 0
            buttonsDisable()
        }
        else if(partys_keywords.contains(searchTextField.text!)){
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

