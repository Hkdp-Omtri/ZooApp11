//
//  ViewController.swift
//  Omtri_Calculator
//
//  Created by Omtri,Homakesavadurgaprasad on 2/17/22.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var Displaylabel: UILabel!
    var operand1 = 0
    var operand2 = 0
    var varNumberResult = 0
    var Operator = "+"
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBAction func AcButton(_ sender: UIButton) {
        clearText()
    }
    func clearText()
    {
        Displaylabel.text = ""
    }
    
    @IBAction func Cbutton(_ sender: UIButton) {
    }
    
    @IBAction func PlusandMinus(_ sender: UIButton) {
    }
    
    @IBAction func Plus(_ sender: UIButton) {
        var Operator = "+"
        var operand1 = Int(Displaylabel.text!)!
        clearText()
        
    }
    
    @IBAction func Seven(_ sender: UIButton) {
        Displaylabel.text = Displaylabel.text! + "7"
    }
    
    @IBAction func Eigth(_ sender: UIButton) {
        Displaylabel.text = Displaylabel.text! + "8"
    }
    
    @IBAction func Nine(_ sender: UIButton) {
        Displaylabel.text = Displaylabel.text! + "9"
    }
    
    @IBAction func Multiply(_ sender: UIButton) {
        var Operator = "*"
        var operand1 = Int(Displaylabel.text!)!
        clearText()
    }
    
    @IBAction func Four(_ sender: UIButton) {
        Displaylabel.text = Displaylabel.text! + "4"
    }
    
    @IBAction func Five(_ sender: UIButton) {
        Displaylabel.text = Displaylabel.text! + "5"
    }
    
    @IBAction func Six(_ sender: UIButton) {
        Displaylabel.text = Displaylabel.text! + "6"
    }
    
    @IBAction func Minus(_ sender: UIButton) {
        var Operator = "-"
        var operand1 = Int(Displaylabel.text!)!
        clearText()
    }

    @IBAction func One(_ sender: UIButton) {
        Displaylabel.text = Displaylabel.text! + "1"
    }
    
    @IBAction func Two(_ sender: UIButton) {
        Displaylabel.text = Displaylabel.text! + "2"
    }
    
    @IBAction func Three(_ sender: UIButton) {
        Displaylabel.text = Displaylabel.text! + "3"
    }

    @IBAction func Divide(_ sender: UIButton) {
        var Operator = "/"
        var operand1 = Int(Displaylabel.text!)!
        clearText()
    }
    
    @IBAction func Zero(_ sender: UIButton) {
        Displaylabel.text = Displaylabel.text! + "0"
    }
    
    @IBAction func Dot(_ sender: UIButton) {
        Displaylabel.text = Displaylabel.text! + "."
    }
    
    @IBAction func Module(_ sender: UIButton) {
        var Operator = "%"
        var operand1 = Int(Displaylabel.text!)!
        clearText()
    }
    
    @IBAction func Equals(_ sender: UIButton) {
        var operand2 = Int(Displaylabel.text!)!
        switch Operator {
        case "+" :
            varNumberResult = operand1 + operand2
            Displaylabel.text = String(varNumberResult)
            
        case "=" :
            varNumberResult = operand1 - operand2
            Displaylabel.text = String(varNumberResult)
            
        case "/" :
            varNumberResult = operand1 / operand2
            Displaylabel.text = String(varNumberResult)
            
        case "*" :
            varNumberResult = operand1 * operand2
            Displaylabel.text = String(varNumberResult)
            
        case "%" :
            varNumberResult = operand1 % operand2
            Displaylabel.text = String(varNumberResult)
            
        default:
            Displaylabel.text = "Error"
        }
        
    }
}

