//
//  ViewController.swift
//  Cordinate systemdemo
//
//  Created by Omtri,Homakesavadurgaprasad on 3/1/22.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var imageviewcontroller: UIImageView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        let minX = imageviewcontroller.frame.minX;
        let minY = imageviewcontroller.frame.minY;
        print("(\(minX), \(minY))");
        
        let maxX = imageviewcontroller.frame.maxX;
        let maxY = imageviewcontroller.frame.maxY;
        print("(\(maxX), \(maxY))");
        
        let midX = imageviewcontroller.frame.midX;
        let midY = imageviewcontroller.frame.midY;
        print("(\(midX), \(midY))");
        
        
        //change the location of the image to left corner of the display
        imageviewcontroller.frame.origin.x = 0
        imageviewcontroller.frame.origin.y = 0
        
        //change the location of the image to upper right of the display
        imageviewcontroller.frame.origin.x = 264.0
        imageviewcontroller.frame.origin.y = 0
        
        //change the location of the image to bottom left of the display
        imageviewcontroller.frame.origin.x = 0
        imageviewcontroller.frame.origin.y = 800.0
        
        //change the location of the image to center of the screen.
        imageviewcontroller.frame.origin.x = 157
        imageviewcontroller.frame.origin.y = 398
    }


}

