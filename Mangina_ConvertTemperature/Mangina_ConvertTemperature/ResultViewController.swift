//
//  ResultViewController.swift
//  Mangina_ConvertTemperature
//
//  Created by JayaShankar Mangina on 11/2/21.
//

import UIKit

class ResultViewController: UIViewController {
    
    var temp:Double?
    var weatherImagesArray = ["freeze","cold","pleasant","hot","boiling"]
//    var textArray = ["It's Freezing out there.",
//                     "It's Freaking Cold outside.",
//                     "The weather is so pleasant outside. You must see it yourself",
//                     "The temperature bars are rising. Please follow precautions.",
//                     "It's so horible outside. Try to stay inside."]
    var fahrenheit:Double = 0.0
    var kelvin:Double = 0.0
    var imageIterator = 0
    @IBOutlet weak var fahrenheitLabel: UILabel!
    
    @IBOutlet weak var kelvinLabel: UILabel!
    
    @IBOutlet weak var textLabel: UILabel!
    
    @IBOutlet weak var imageView: UIImageView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        fahrenheit = (round(((temp! * 1.8) + 32)*100)/100)
        fahrenheitLabel.text = "Temperature in Fahrenheit: \(fahrenheit)°F"
        
        kelvin = temp! + 273.15
        kelvinLabel.text = "Temperature in Kelvin: \(kelvin)°K"
        
        func updateImageView(_ imageIterator:Int){
            imageView.isHidden = false
            imageView.image = UIImage(named: weatherImagesArray[imageIterator])
            let originalImageFrame = imageView.frame
            let widthShrink: CGFloat = 40
            let heightShrink: CGFloat = 40
            let newFrame = CGRect(
            x: imageView.frame.origin.x + widthShrink,
            y: imageView.frame.origin.y + heightShrink,
            width: imageView.frame.width - widthShrink,
            height: imageView.frame.height - heightShrink)
            imageView.frame = newFrame
            UIView.animate(withDuration: 1.0, delay: 0, usingSpringWithDamping: 0.2, initialSpringVelocity: 40.0,  animations: {
                self.imageView.frame = originalImageFrame
                
            })
            
        }
        
        let tempInInt = Int(temp!)
        switch tempInInt{
        case let t where t<5:
            textLabel.text = "It's Freezing out there."
            updateImageView(0)
        case 5...59:
            textLabel.text = "It's Freaking Cold outside."
            updateImageView(1)
        case 60...77:
            textLabel.text = "The weather is so pleasant outside. You must see it yourself"
            updateImageView(2)
        case 78...95:
            textLabel.text = "The temperature bars are rising. Please follow precautions."
            updateImageView(3)
        case let t where t>95:
            textLabel.text = "It's so horible outside. Try to stay inside."
            updateImageView(4)
        default:
            textLabel.text = "Error"
        }
        
    }
    
    
}
