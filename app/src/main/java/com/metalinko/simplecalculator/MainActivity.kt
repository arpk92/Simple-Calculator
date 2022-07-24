package com.metalinko.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.metalinko.simplecalculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.ac.setOnClickListener{

                binding.input.text= ""
            binding.output.text=""

        }


        binding.zero.setOnClickListener{


            binding.input.append("0")

        }


        binding.one.setOnClickListener{

            binding.input.append("1")
        }


        binding.two.setOnClickListener{

            binding.input.append("2")
        }

        binding.three.setOnClickListener{

            binding.input.append("3")
        }

        binding.four.setOnClickListener{

            binding.input.append("4")
        }


        binding.five.setOnClickListener{

            binding.input.append("5")
        }


        binding.six.setOnClickListener{

            binding.input.append("6")
        }

        binding.seven.setOnClickListener{

            binding.input.append("7")
        }

        binding.eight.setOnClickListener{

            binding.input.append("8")
        }

        binding.nine.setOnClickListener{

            binding.input.append("9")
        }


        binding.startb.setOnClickListener{

            binding.input.append("(")
        }

        binding.endb.setOnClickListener{

            binding.input.append(")")
        }

        binding.dot.setOnClickListener{

            binding.input.append(".")
        }

        binding.plus.setOnClickListener{

            binding.input.append("+")
        }

        binding.minus.setOnClickListener{

            binding.input.append("-")
        }

        binding.multiplication.setOnClickListener{

            binding.input.append("*")
        }

        binding.divide.setOnClickListener{

            binding.input.append("/")
        }


        binding.equal.setOnClickListener{

           val expression = ExpressionBuilder(binding.input.text.toString()).build()

            val result = expression.evaluate()
            val double = result.toLong()

            if(result == double.toDouble())
            {
                        binding.output.text = double.toString()

            }else

            {

                binding.output.text = result.toString()

            }




        }



    }
}