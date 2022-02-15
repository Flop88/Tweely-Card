//  AppDelegate.swift
//  iosApp
//
//  Created by Максим Лихачев on 15.02.2022.
//  Copyright © 2022 orgName. All rights reserved.
//

import Foundation
import UIKit
import shared

class AppDelegate: NSObject, UIApplicationDelegate {
    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey : Any]? = nil) -> Bool {
                TweelySDK().doInit(configuration: Configuration(platformType: PlatformType.iOS.init(version: "1.0", buildNumber: "1")))
        return true
    }
}
