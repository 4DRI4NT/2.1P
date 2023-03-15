package com.example.a21p;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText inputUnit;
    TextView outputUnit;
    Spinner fromUnit, toUnit;
    Button convertButton;

    String inputText;
    int fromValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputUnit = findViewById(R.id.inputUnit);
        outputUnit = findViewById(R.id.outputUnit);
        fromUnit = findViewById(R.id.fromUnit);
        toUnit = findViewById(R.id.toUnit);
        convertButton = findViewById(R.id.convertButton);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check for empty input
                if (TextUtils.isEmpty(inputUnit.getText())) {
                    inputUnit.setError(getText(R.string.emptyField));
                    outputUnit.setText(R.string.invalidOption);
                    Toast.makeText(MainActivity.this, R.string.invalidOption, Toast.LENGTH_LONG).show();
                } else {

                    //save input value
                    inputText = inputUnit.getText().toString();
                    fromValue = Integer.parseInt(inputText);

                    //distance conversions
                    if (fromUnit.getSelectedItem().toString().equals("Centimeters")) {
                        if (toUnit.getSelectedItem().toString().equals("Centimeters")) {
                            outputUnit.setText(R.string.identicalUnits);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        } else if (toUnit.getSelectedItem().toString().equals("Kilometers")) {
                            outputUnit.setText(String.valueOf(fromValue / 100000.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Inches")) {
                            outputUnit.setText(String.valueOf(fromValue / 2.540));
                        } else if (toUnit.getSelectedItem().toString().equals("Feet")) {
                            outputUnit.setText(String.valueOf(fromValue / 30.480));
                        } else if (toUnit.getSelectedItem().toString().equals("Yards")) {
                            outputUnit.setText(String.valueOf(fromValue / 91.440));
                        } else if (toUnit.getSelectedItem().toString().equals("Miles")) {
                            outputUnit.setText(String.valueOf(fromValue / 160900.000));
                        } else {
                            outputUnit.setText(R.string.invalidConversion);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        }
                    } else if (fromUnit.getSelectedItem().toString().equals("Kilometers")) {
                        if (toUnit.getSelectedItem().toString().equals("Centimeters")) {
                            outputUnit.setText(String.valueOf(fromValue * 100000.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Kilometers")) {
                            outputUnit.setText(R.string.identicalUnits);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        } else if (toUnit.getSelectedItem().toString().equals("Inches")) {
                            outputUnit.setText(String.valueOf(fromValue * 39370.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Feet")) {
                            outputUnit.setText(String.valueOf(fromValue * 3281.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Yards")) {
                            outputUnit.setText(String.valueOf(fromValue * 1094.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Miles")) {
                            outputUnit.setText(String.valueOf(fromValue / 1.609));
                        } else {
                            outputUnit.setText(R.string.invalidConversion);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        }
                    } else if (fromUnit.getSelectedItem().toString().equals("Inches")) {
                        if (toUnit.getSelectedItem().toString().equals("Centimeters")) {
                            outputUnit.setText(String.valueOf(fromValue * 2.540));
                        } else if (toUnit.getSelectedItem().toString().equals("Kilometers")) {
                            outputUnit.setText(String.valueOf(fromValue / 39370.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Inches")) {
                            outputUnit.setText(R.string.identicalUnits);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        } else if (toUnit.getSelectedItem().toString().equals("Feet")) {
                            outputUnit.setText(String.valueOf(fromValue / 12.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Yards")) {
                            outputUnit.setText(String.valueOf(fromValue / 36.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Miles")) {
                            outputUnit.setText(String.valueOf(fromValue / 63360.000));
                        } else {
                            outputUnit.setText(R.string.invalidConversion);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        }
                    } else if (fromUnit.getSelectedItem().toString().equals("Feet")) {
                        if (toUnit.getSelectedItem().toString().equals("Centimeters")) {
                            outputUnit.setText(String.valueOf(fromValue * 30.480));
                        } else if (toUnit.getSelectedItem().toString().equals("Kilometers")) {
                            outputUnit.setText(String.valueOf(fromValue / 3281.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Inches")) {
                            outputUnit.setText(String.valueOf(fromValue * 12.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Feet")) {
                            outputUnit.setText(R.string.identicalUnits);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        } else if (toUnit.getSelectedItem().toString().equals("Yards")) {
                            outputUnit.setText(String.valueOf(fromValue / 3.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Miles")) {
                            outputUnit.setText(String.valueOf(fromValue / 5280.000));
                        } else {
                            outputUnit.setText(R.string.invalidConversion);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        }
                    } else if (fromUnit.getSelectedItem().toString().equals("Yards")) {
                        if (toUnit.getSelectedItem().toString().equals("Centimeters")) {
                            outputUnit.setText(String.valueOf(fromValue * 91.440));
                        } else if (toUnit.getSelectedItem().toString().equals("Kilometers")) {
                            outputUnit.setText(String.valueOf(fromValue / 1094.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Inches")) {
                            outputUnit.setText(String.valueOf(fromValue * 36.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Feet")) {
                            outputUnit.setText(String.valueOf(fromValue * 3.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Yards")) {
                            outputUnit.setText(R.string.identicalUnits);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        } else if (toUnit.getSelectedItem().toString().equals("Miles")) {
                            outputUnit.setText(String.valueOf(fromValue / 1760.000));
                        } else {
                            outputUnit.setText(R.string.invalidConversion);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        }
                    } else if (fromUnit.getSelectedItem().toString().equals("Miles")) {
                        if (toUnit.getSelectedItem().toString().equals("Centimeters")) {
                            outputUnit.setText(String.valueOf(fromValue * 160900.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Kilometers")) {
                            outputUnit.setText(String.valueOf(fromValue * 1.609));
                        } else if (toUnit.getSelectedItem().toString().equals("Inches")) {
                            outputUnit.setText(String.valueOf(fromValue * 63360.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Feet")) {
                            outputUnit.setText(String.valueOf(fromValue * 5280.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Yards")) {
                            outputUnit.setText(String.valueOf(fromValue * 1760.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Miles")) {
                            outputUnit.setText(R.string.identicalUnits);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        } else {
                            outputUnit.setText(R.string.invalidConversion);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        }
                    }

                    //weight conversions
                    else if (fromUnit.getSelectedItem().toString().equals("Grams")) {
                        if (toUnit.getSelectedItem().toString().equals("Grams")) {
                            outputUnit.setText(R.string.identicalUnits);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        } else if (toUnit.getSelectedItem().toString().equals("Kilograms")) {
                            outputUnit.setText(String.valueOf(fromValue / 1000.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Pounds")) {
                            outputUnit.setText(String.valueOf(fromValue / 453.600));
                        } else if (toUnit.getSelectedItem().toString().equals("Ounces")) {
                            outputUnit.setText(String.valueOf(fromValue / 28.350));
                        } else if (toUnit.getSelectedItem().toString().equals("Tonnes")) {
                            outputUnit.setText(String.valueOf(fromValue / 907200.000));
                        } else {
                            outputUnit.setText(R.string.invalidConversion);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        }
                    } else if (fromUnit.getSelectedItem().toString().equals("Kilograms")) {
                        if (toUnit.getSelectedItem().toString().equals("Grams")) {
                            outputUnit.setText(String.valueOf(fromValue * 1000.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Kilograms")) {
                            outputUnit.setText(R.string.identicalUnits);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        } else if (toUnit.getSelectedItem().toString().equals("Pounds")) {
                            outputUnit.setText(String.valueOf(fromValue * 2.205));
                        } else if (toUnit.getSelectedItem().toString().equals("Ounces")) {
                            outputUnit.setText(String.valueOf(fromValue * 35.274));
                        } else if (toUnit.getSelectedItem().toString().equals("Tonnes")) {
                            outputUnit.setText(String.valueOf(fromValue / 907.200));
                        } else {
                            outputUnit.setText(R.string.invalidConversion);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        }
                    } else if (fromUnit.getSelectedItem().toString().equals("Pounds")) {
                        if (toUnit.getSelectedItem().toString().equals("Grams")) {
                            outputUnit.setText(String.valueOf(fromValue * 453.600));
                        } else if (toUnit.getSelectedItem().toString().equals("Kilograms")) {
                            outputUnit.setText(String.valueOf(fromValue / 2.205));
                        } else if (toUnit.getSelectedItem().toString().equals("Pounds")) {
                            outputUnit.setText(R.string.identicalUnits);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        } else if (toUnit.getSelectedItem().toString().equals("Ounces")) {
                            outputUnit.setText(String.valueOf(fromValue * 16.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Tonnes")) {
                            outputUnit.setText(String.valueOf(fromValue / 2000.000));
                        } else {
                            outputUnit.setText(R.string.invalidConversion);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        }
                    } else if (fromUnit.getSelectedItem().toString().equals("Ounces")) {
                        if (toUnit.getSelectedItem().toString().equals("Grams")) {
                            outputUnit.setText(String.valueOf(fromValue * 28.350));
                        } else if (toUnit.getSelectedItem().toString().equals("Kilograms")) {
                            outputUnit.setText(String.valueOf(fromValue / 35.274));
                        } else if (toUnit.getSelectedItem().toString().equals("Pounds")) {
                            outputUnit.setText(String.valueOf(fromValue / 16.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Ounces")) {
                            outputUnit.setText(R.string.identicalUnits);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        } else if (toUnit.getSelectedItem().toString().equals("Tonnes")) {
                            outputUnit.setText(String.valueOf(fromValue / 32000.000));
                        } else {
                            outputUnit.setText(R.string.invalidConversion);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        }
                    } else if (fromUnit.getSelectedItem().toString().equals("Tonnes")) {
                        if (toUnit.getSelectedItem().toString().equals("Grams")) {
                            outputUnit.setText(String.valueOf(fromValue * 907200.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Kilograms")) {
                            outputUnit.setText(String.valueOf(fromValue * 907.200));
                        } else if (toUnit.getSelectedItem().toString().equals("Pounds")) {
                            outputUnit.setText(String.valueOf(fromValue * 2000.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Ounces")) {
                            outputUnit.setText(String.valueOf(fromValue * 32000.000));
                        } else if (toUnit.getSelectedItem().toString().equals("Tonnes")) {
                            outputUnit.setText(R.string.identicalUnits);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        } else {
                            outputUnit.setText(R.string.invalidConversion);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        }
                    }

                    //temperature conversions
                    else if (fromUnit.getSelectedItem().toString().equals("Celsius")) {
                        if (toUnit.getSelectedItem().toString().equals("Celsius")) {
                            outputUnit.setText(R.string.identicalUnits);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        } else if (toUnit.getSelectedItem().toString().equals("Fahrenheit")) {
                            outputUnit.setText(String.valueOf((fromValue * 1.800) + 32));
                        } else if (toUnit.getSelectedItem().toString().equals("Kelvin")) {
                            outputUnit.setText(String.valueOf(fromValue + 273.150));
                        } else {
                            outputUnit.setText(R.string.invalidConversion);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        }
                    } else if (fromUnit.getSelectedItem().toString().equals("Fahrenheit")) {
                        if (toUnit.getSelectedItem().toString().equals("Celsius")) {
                            outputUnit.setText(String.valueOf((fromValue - 32) / 1.800));
                        } else if (toUnit.getSelectedItem().toString().equals("Fahrenheit")) {
                            outputUnit.setText(R.string.identicalUnits);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        } else if (toUnit.getSelectedItem().toString().equals("Kelvin")) {
                            outputUnit.setText(String.valueOf((((fromValue - 32) * 5) / 9) + 273.150));
                        } else {
                            outputUnit.setText(R.string.invalidConversion);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        }
                    } else if (fromUnit.getSelectedItem().toString().equals("Kelvin")) {
                        if (toUnit.getSelectedItem().toString().equals("Celsius")) {
                            outputUnit.setText(String.valueOf(fromValue - 273.150));
                        } else if (toUnit.getSelectedItem().toString().equals("Fahrenheit")) {
                            outputUnit.setText(String.valueOf((fromValue - 273.150) * 9 / 5 + 32));
                        } else if (toUnit.getSelectedItem().toString().equals("Kelvin")) {
                            outputUnit.setText(R.string.identicalUnits);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        } else {
                            outputUnit.setText(R.string.invalidConversion);
                            Toast.makeText(MainActivity.this, R.string.incompatibleUnits, Toast.LENGTH_LONG).show();
                        }
                    } else {
                        outputUnit.setText(R.string.invalidOption);
                        Toast.makeText(MainActivity.this, R.string.unintendedUnit, Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}