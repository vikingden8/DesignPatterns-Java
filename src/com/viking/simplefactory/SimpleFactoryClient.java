package com.viking.simplefactory;
/*  Copyright 2016 - Viking Den vikingden7@gmail.com
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
*   Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/
import com.viking.simplefactory.Car;
import com.viking.simplefactory.SimpleFactory;
import com.viking.util.Log;


public class SimpleFactoryClient {

    public static void main(String[] args){
        Log.info("simple-factory" , "-----------------------------------------");
        Car car = SimpleFactory.getCarInstance() ;
        car.start();
        car.stop();

        Log.info("simple-factory" ,"-----------------------------------------");
        car = SimpleFactory.getCarInstanceByName("porsche") ;
        car.start();
        car.stop();

        Log.info("simple-factory" ,"-----------------------------------------");
        car = SimpleFactory.getCarInstanceByReflection("com.viking.dp01.simplefactory.AudiCar") ;
        car.start();
        car.stop();

    }
}
