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

public class SimpleFactory {

    public static Car getCarInstance(){
        return new BenzCar() ;
    }

    public static Car getCarInstanceByName(String type){
        if("benz".equalsIgnoreCase(type)){
            return new BenzCar() ;
        }else if("audi".equalsIgnoreCase(type)){
            return new AudiCar() ;
        }else if("porsche".equalsIgnoreCase(type)){
            return new Porsche() ;
        }else {
            throw new IllegalArgumentException("Not implement yet") ;
        }
    }

    public static Car getCarInstanceByReflection(String name){
        Car car = null;
        try {
            car = (Car)Class.forName(name).newInstance() ;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return car ;
    }

}
