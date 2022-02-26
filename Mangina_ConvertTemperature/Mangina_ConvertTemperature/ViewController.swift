//
//  ViewController.swift
//  Mangina_ConvertTemperature
//
//  Created by JayaShankar Mangina on 11/2/21.
//

import UIKit

class ViewController: UIViewController {
    var inputDegrees:String = ""
    var newfahrenHeit:Double = 0.0
    var newKelvin:Double = 0.0
    
    @IBOutlet weak var tempTextField: UITextField!
    @IBOutlet weak var convertButton: UIButton!
    override func viewDidLoad() {
        super.viewDidLoad()
        convertButton.isEnabled = false
        convertButton.backgroundColor = .systemGray
        // Do any additional setup after loading the view.
    }
    
    func inputValidation() {
        let inputEntered = tempTextField.text!
        if inputEntered.isEmpty {
            convertButton.isEnabled = false
            convertButton.backgroundColor = .systemGray
        }else{
            convertButton.isEnabled = true
            convertButton.backgroundColor = .systemGreen

        }
        let inputIsInt = Int(tempTextField.text!)
        if inputIsInt != nil {
            convertButton.isEnabled = true
            convertButton.tintColor = .systemGreen
        }else{
            
            convertButton.isEnabled = false
            convertButton.backgroundColor = .systemGray
        }
    }
    
    @IBAction func tempTextFieldChanged(_ sender: UITextField) {
        inputValidation()
    }
    
    @IBAction func convertButtonPressed(_ sender: UIButton) {

    }
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        let segueTaransition = segue.identifier
        if segueTaransition == "convertTemp" {
            let segueDestination = segue.destination as! ResultViewController
            segueDestination.temp = Double(tempTextField.text!)!
        }
    }
    

}

