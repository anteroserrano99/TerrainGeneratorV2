package com.terrain.generator.noisegenerator.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class NoiseMapController {



    @RequestMapping("/")
    fun generateNoise(@RequestParam(required = false) algorithm:String?, @RequestParam(required = false)seed: Long?) : String{

        return "test";
    }


    @RequestMapping("/getAlgorithmns")
    fun getValidAlgorithms() : Array<String> {

        return Array(1) {DEFAULT_ALGORITHM};
    }



    companion object Constants {
        const val DEFAULT_SEED:Long = 0L
        const val DEFAULT_ALGORITHM = "DiamondSquare"
    }


}