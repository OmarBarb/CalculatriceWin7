package com.Omar.CalculatriceWin7;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static java.lang.Double.parseDouble;

import android.util.Log;
import java.text.DecimalFormat;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class MainActivity extends AppCompatActivity {

    //Déclaration des variables que l'on va initialiser dans onCreate
    protected Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnDot, btnPlus, btnMinus, btnMult, btnDiv, btnEqual, btn1SurX,
            btnPercent, btnRacine, btnPlusMin, btnC, btnCE, btnBack;
    private TextView saisie, resultat;

    String textSaisi, textResultat;
    private double mValueOne, mValueTwo;
    public Boolean addition, soustraction, multiplication, division;

    //nombre de chiffres (13 ici) après la virgule
    DecimalFormat decForm = new DecimalFormat("@############");

    //on déclare un objet pour utiliser la fonction eval()
    Object result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //prevent landscape orientation = empêcher l'orientation paysage
      //  setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //attribution des valeurs aux différentes variables
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);
        btnDot = findViewById(R.id.btnDot);

        btnEqual = findViewById(R.id.btnEqual);
        btn1SurX = findViewById(R.id.btn1SurX);
        btnPercent = findViewById(R.id.btnPercent);
        btnRacine = findViewById(R.id.btnRacine);
        btnPlusMin = findViewById(R.id.btnPlusMin);
        btnC = findViewById(R.id.btnC);
        btnCE = findViewById(R.id.btnCE);
        btnBack = findViewById(R.id.btnBack);

        saisie = findViewById(R.id.saisie);
        resultat = findViewById(R.id.resultat);

        addition = false;
        soustraction = false;
        multiplication = false;
        division = false;

        //le son du clic à activer au toucher des boutons
        final MediaPlayer clickSound = MediaPlayer.create(this, R.raw.click);

        //to save data on orientation change, on doit redéfinir onSaveInstanceState() en bas
        //pour garder les données quand on change l'orientation, on ajoute ça et
        //on redéfinit onSaveInstanceState() en dehors de onCreate()
        if (savedInstanceState != null) {
            textResultat = savedInstanceState.getString("textResultat");
            textSaisi = savedInstanceState.getString("textSaisi");
            saisie.setText(textSaisi);
            resultat.setText(textResultat);
        }//

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                textSaisi = saisie.getText() + "0";
                saisie.setText(textSaisi);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                textSaisi = saisie.getText().toString();
                if(textSaisi.indexOf("0") == 0 && textSaisi.length() == 1)
                    textSaisi = "1";
                else
                    textSaisi += "1";

                saisie.setText(textSaisi);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                textSaisi = saisie.getText().toString();
                if(textSaisi.indexOf("0") == 0 && textSaisi.length() == 1)
                    textSaisi = "2";
                else
                    textSaisi += "2";

                saisie.setText(textSaisi);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                textSaisi = saisie.getText().toString();
                if(textSaisi.indexOf("0") == 0 && textSaisi.length() == 1)
                    textSaisi = "3";
                else
                    textSaisi += "3";

                saisie.setText(textSaisi);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                textSaisi = saisie.getText().toString();
                if(textSaisi.indexOf("0") == 0 && textSaisi.length() == 1)
                    textSaisi = "4";
                else
                    textSaisi += "4";

                saisie.setText(textSaisi);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                textSaisi = saisie.getText().toString();
                if(textSaisi.indexOf("0") == 0 && textSaisi.length() == 1)
                    textSaisi = "5";
                else
                    textSaisi += "5";

                saisie.setText(textSaisi);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                textSaisi = saisie.getText().toString();
                if(textSaisi.indexOf("0") == 0 && textSaisi.length() == 1)
                    textSaisi = "6";
                else
                    textSaisi += "6";

                saisie.setText(textSaisi);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                textSaisi = saisie.getText().toString();
                if(textSaisi.indexOf("0") == 0 && textSaisi.length() == 1)
                    textSaisi = "7";
                else
                    textSaisi += "7";

                saisie.setText(textSaisi);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                textSaisi = saisie.getText().toString();
                if(textSaisi.indexOf("0") == 0 && textSaisi.length() == 1)
                    textSaisi = "8";
                else
                    textSaisi += "8";

                saisie.setText(textSaisi);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                textSaisi = saisie.getText().toString();
                if(textSaisi.indexOf("0") == 0 && textSaisi.length() == 1)
                    textSaisi = "9";
                else
                    textSaisi += "9";

                saisie.setText(textSaisi);
            }
        });

        //bouton ajouter appuyé
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                    try {
                        if (!operateurAlaFinDe(textSaisi)) {
                            textSaisi += "+";
                            saisie.setText(textSaisi);
                        }
                        else {
                            textSaisi = textSaisi.substring(0,textSaisi.length()-1) + "+";
                            saisie.setText(textSaisi);
                        }
                    }
                    catch (NullPointerException e){
                        textSaisi = "0+";
                        saisie.setText(textSaisi);
                    }catch (StringIndexOutOfBoundsException ex){Log.e("catch block", ex.toString());}
                }
        });

        //bouton soustaction appuyé
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                try {
                    if (!operateurAlaFinDe(textSaisi)) {
                        textSaisi += "-";
                        saisie.setText(textSaisi);
                    }
                    else {
                        textSaisi = textSaisi.substring(0,textSaisi.length()-1) + "-";
                        saisie.setText(textSaisi);
                    }
                } catch (NullPointerException e){
                    textSaisi = "0-";
                    saisie.setText(textSaisi);
                }catch (StringIndexOutOfBoundsException ex){Log.e("catch block", ex.toString());}
            }
        });

        //bouton multiplier appuyé
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                try {
                    if (!operateurAlaFinDe(textSaisi)) {
                        textSaisi += "x";
                        saisie.setText(textSaisi);
                    }
                    else {
                        textSaisi = textSaisi.substring(0,textSaisi.length()-1) + "x";
                        saisie.setText(textSaisi);
                    }
                } catch (NullPointerException e){
                    textSaisi = "0x";
                    saisie.setText(textSaisi);
                }catch (StringIndexOutOfBoundsException ex)
                {Log.e("catch block", ex.toString());}
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                try {
                    if (!operateurAlaFinDe(textSaisi)) {
                        textSaisi += "÷";
                        saisie.setText(textSaisi);
                    }
                    else {
                        textSaisi = textSaisi.substring(0,textSaisi.length()-1) + "÷";
                        saisie.setText(textSaisi);
                    }
                } catch (NullPointerException e){
                    textSaisi = "0÷";
                    saisie.setText(textSaisi);
                }catch (StringIndexOutOfBoundsException ex)
                {Log.e("catch block", ex.toString());}
            }
        });

        //bouton égal appuyé
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                try {
                    //pour utiliser eval(), on crée ces instances, classes déjà importées
                    ScriptEngineManager manager = new ScriptEngineManager();
                    ScriptEngine se = manager.getEngineByName("rhino");

                    textSaisi = saisie.getText().toString().replace("÷", "/").replace("x", "*");
                    result = se.eval(textSaisi);    //se.eval() retourne un objet
                    textResultat = result.toString();//on peut écrire textResultat = se.eval(textSaisi).toString;
                    if (textResultat.equalsIgnoreCase("Infinity")) {
                        Log.e("String", textResultat);
                        textSaisi = "";
                        saisie.setText(textSaisi);
                        textResultat = "Division par 0!";
                        resultat.setText(textResultat);
                    }else {
                        resultat.setText(decForm.format(parseDouble(textResultat)));
                        textSaisi = textResultat;
                        saisie.setText(null);
                    }
                }catch (ScriptException | NullPointerException
                        | StringIndexOutOfBoundsException ex)
                {Log.e("catch block", ex.toString());}
            }
        });

      btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                if((saisie.getText().toString()).contains(".") && contientOperateur(saisie.getText().toString())){
                    textSaisi = saisie.getText().toString() + ".";
                    saisie.setText(textSaisi);
                }
                if(!(saisie.getText().toString()).contains(".")){
                    textSaisi = saisie.getText().toString() + ".";
                    saisie.setText(textSaisi);
                }
                if((saisie.getText().toString()).indexOf(".") == 0){
                    saisie.setText("0.");
                }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                mValueOne = 0;
                textSaisi = "";
                textResultat = "0";
                saisie.setText(null);
                textResultat = "0";
                resultat.setText("0");
            }
        });

        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                mValueOne = 0;
                mValueTwo = 0;
                textSaisi = "";
                textResultat = "0";
                saisie.setText(null);
                resultat.setText("0");
            }
        });

        btnPlusMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                String input = saisie.getText().toString().replace(",", ".");
                if(!input.contains("-"))
                    saisie.setText("-" + input);
                else if(input.indexOf("-") == 0){
                    saisie.setText(input.substring(1));
                }
            }
        });

        btn1SurX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                try{
                    Double input = parseDouble(saisie.getText().toString().replace(",", "."));
                    if(input != 0){
                        saisie.setText(String.valueOf(decForm.format(1/input)));
                        resultat.setText(String.valueOf(decForm.format(1/input)));
                    }else {
                        saisie.setText(null);
                        resultat.setText("Division par 0!");
                    }
                }catch (NumberFormatException e) {
                    try {
                        if (resultat.getText().toString().contains("par")) {
                        } else {
                            Double input = parseDouble((resultat.getText().toString()).replace(",", "."));
                            if (input != 0) {
                                saisie.setText(String.valueOf(decForm.format(1 / input)));
                                resultat.setText(String.valueOf(decForm.format(1 / input)));
                            } else {
                                saisie.setText(null);
                                resultat.setText("Division par 0!");
                            }
                        }
                    }catch (NumberFormatException ex){Log.e("catch block", ex.toString());}
                }
            }
        });

        btnRacine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                Double input;
                 try {
                     input = parseDouble(saisie.getText().toString().replace(",", "."));
                     if(input >= 0) {
                         saisie.setText(String.valueOf(decForm.format(Math.sqrt(input))));
                         resultat.setText(String.valueOf(decForm.format(Math.sqrt(input))));
                     }else{
                         saisie.setText(null);
                         resultat.setText("Entrée invalide");
                     }
                 } catch (NumberFormatException e){
                     try {
                         if (resultat.getText().toString().contains("par")) {
                         } else {
                             input = parseDouble((resultat.getText().toString()).replace(",", "."));
                             if (input >= 0) {
                                 saisie.setText(String.valueOf(decForm.format(Math.sqrt(input))));
                                 resultat.setText(String.valueOf(decForm.format(Math.sqrt(input))));
                             } else {
                                 saisie.setText(null);
                                 resultat.setText("Entrée invalide");
                             }
                         }
                     }catch (StringIndexOutOfBoundsException | NumberFormatException ex){
                         Log.e("catch block", ex.toString());
                     }
                 }
            }
        });

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                try {
                    textSaisi = saisie.getText().toString().replace(",", ".");
                    textSaisi += "%";
                    saisie.setText(textSaisi);
                    if (textSaisi.contains("+")) {
                        mValueOne = parseDouble(saisie.getText().toString().substring(0, textSaisi.indexOf("+")));
                        mValueTwo = parseDouble(saisie.getText().toString().substring(textSaisi.indexOf("+")+1, textSaisi.indexOf("%")));
                        resultat.setText(String.valueOf(decForm.format(mValueOne + mValueOne * mValueTwo / 100)));
                    } else if (textSaisi.contains("-")) {
                        mValueOne = parseDouble(saisie.getText().toString().substring(0, textSaisi.indexOf("-")));
                        mValueTwo = parseDouble(saisie.getText().toString().substring(textSaisi.indexOf("-")+1, textSaisi.indexOf("%")));
                        resultat.setText(String.valueOf(decForm.format(mValueOne - mValueOne * mValueTwo / 100)));
                    } else if (textSaisi.contains("x") || textSaisi.contains("*")){
                        mValueOne = parseDouble(saisie.getText().toString().substring(0, textSaisi.indexOf("x")));
                        mValueTwo = parseDouble(saisie.getText().toString().substring(textSaisi.indexOf("x")+1, textSaisi.indexOf("%")));
                        resultat.setText(String.valueOf(decForm.format(mValueOne * mValueOne * mValueTwo / 100)));
                    } else if (textSaisi.contains("÷") || textSaisi.contains("/")) {
                        mValueOne = parseDouble(saisie.getText().toString().substring(0, textSaisi.indexOf("÷")));
                        mValueTwo = parseDouble(saisie.getText().toString().substring(textSaisi.indexOf("÷")+1, textSaisi.indexOf("%")));
                        resultat.setText(String.valueOf(decForm.format(mValueOne / (mValueOne * mValueTwo / 100))));
                    } else {
                         textResultat = saisie.getText().toString().replace(",", ".");
                         textResultat = textResultat.replace("%", "");
                         mValueOne = parseDouble(textResultat) / 100;
                         textSaisi = textResultat + "%";
                         saisie.setText(textSaisi);
                         resultat.setText(String.valueOf(mValueOne));
                     }
                 }catch (StringIndexOutOfBoundsException | NumberFormatException e){
                    try {
                        if (resultat.getText().toString().contains("par")) {
                        } else {
                            textResultat = resultat.getText().toString().replace(",", ".");
                            mValueOne = parseDouble(textResultat) / 100;
                            textSaisi = textResultat + "%";
                            saisie.setText(textSaisi);
                            resultat.setText(String.valueOf(mValueOne));
                        }
                    }catch (StringIndexOutOfBoundsException | NumberFormatException ex){
                        Log.e("catch block", ex.toString());
                    }
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                String input = saisie.getText().toString();
                if(input.length() >= 1){
                    textSaisi = input.substring(0, input.length() - 1);
                    saisie.setText(textSaisi);
                }
            }
        });
    }//fin de la méthode onCreate

    protected static boolean operateurAlaFinDe(String chaine){
        char dernierCarac = chaine.charAt(chaine.length() - 1);
        return (dernierCarac == '+' || dernierCarac == '-'
                || dernierCarac == 'x' || dernierCarac == '÷'
                || dernierCarac == '/' || dernierCarac == '*');
    }

    protected boolean contientOperateur(String chaine){
        return (chaine.contains("+") || chaine.contains("-") || chaine.contains("x")
        && chaine.contains("*") || chaine.contains("÷") || chaine.contains("/"));
    }


    //to save data on orientation change
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        textSaisi = saisie.getText().toString();
        textResultat = resultat.getText().toString();
        outState.putString("textSaisi", textSaisi);
        outState.putString("textResultat", textResultat);
    }//fin onSaveInstanceState


}//fin de la classe MainActivity