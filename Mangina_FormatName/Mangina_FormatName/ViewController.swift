//
//  ViewController.swift
//  Mangina_Assignment02
//
//  Created by JayaShankar Mangina on 9/1/21.
//

import UIKit

class ViewController: UIViewController {

//Created an Interface Builder Outlet for firstname TextField and connected it to Interface Builder in Main.storyboard
    @IBOutlet weak var firstNameTextField: UITextField!
    
//Created an Interface Builder Outlet for lastName TextField and connected it to Interface Builder in Main.storyboard
    @IBOutlet weak var lastNameTextField: UITextField!
    
//Created an Interface Builder Outlet for Display Label and connected it to Interface Builder in Main.storyboard
    @IBOutlet weak var displayLabel: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

//Created an Interface Builder Action for Submit Button and connected it to Interface Builder in Main.storyboard
    @IBAction func onClickOfSubmit(_ sender: UIButton) {
        let fNameField = firstNameTextField.text!
        let lNameField = lastNameTextField.text!
        displayLabel.text = "\(lNameField),\(fNameField)"
    }
    
//Created an Interface Builder Action for Reset Button and connected it to Interface Builder in Main.storyboard
    @IBAction func onClickOfReset(_ sender: UIButton) {
        firstNameTextField.text = ""
        lastNameTextField.text = ""
        displayLabel.text = ""
        firstNameTextField.becomeFirstResponder()
    }
    
}

