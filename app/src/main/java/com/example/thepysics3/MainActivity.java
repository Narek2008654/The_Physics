package com.example.thepysics3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import android.annotation.TargetApi;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int a = 0;
    Button home;
    WebView webView;
    Button formula;
    Button lezu;
    Button teorem;
    Button kinematika;
    Button testkinem;
    Button testkinem11;
    Button testkinem12;
    Button testkinem13;
    Button testkinem14;
    Button testkinem21;
    Button testkinem22;
    Button testkinem23;
    Button testkinem24;
    Button testkinem31;
    Button testkinem32;
    Button testkinem33;
    Button testkinem34;
    Button testkinem41;
    Button testkinem42;
    Button testkinem43;
    Button testkinem44;
    Button testkinem51;
    Button testkinem52;
    Button testkinem53;
    Button testkinem54;
    Button testkinem61;
    Button testkinem62;
    Button testkinem63;
    Button testkinem64;
    Button testkinem71;
    Button testkinem72;
    Button testkinem73;
    Button testkinem74;
    Button testkinem81;
    Button testkinem82;
    Button testkinem83;
    Button testkinem84;
    Button dinam;
    Button testdinam;
    Button statika;
    Button teststatik;
    Button hidrostatika;
    Button testhidro;
    Button impuls;
    Button testimpuls;
    Button ashxatanq;
    Button testashx;
    Button termodinamika;
    Button testtermo;
    Button elektrostatika;
    Button testelektro;
    Button eletricheski_tok;
    Button testelektrich;
    Button kolebaniya;
    Button testkol;
    Button optika;
    Button testopt;
    Button mexanika;
    Button molekulyarni_fizika;
    Button elektrichestvo;
    Button opt;
    Button yaderni;
    Button ruseren;
    Button hayeren;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Activity activity = this;
        setContentView(R.layout.activity_main);
        formula = findViewById(R.id.formula);
        formula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.formula);
                home = findViewById(R.id.home);
                home.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                });
                kinematika =findViewById(R.id.kinematika);
                kinematika.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingInflatedId")
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.kinematika);
                        home = findViewById(R.id.home);
                        home.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        testkinem =findViewById(R.id.testkinem);
                        testkinem.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.testkinem);
                                testkinem11 =findViewById(R.id.a1);
                                testkinem11.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        setContentView(R.layout.testkinem2);
                                        testkinem21 =findViewById(R.id.a1);
                                        testkinem21.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.testkinem3);
                                            }
                                        });
                                        setContentView(R.layout.testkinem2);
                                        testkinem22 =findViewById(R.id.a2);
                                        testkinem22.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.testkinem3);
                                            }
                                        });
                                        testkinem23 =findViewById(R.id.a3);
                                        testkinem23.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                a++;
                                                setContentView(R.layout.testkinem3);
                                            }
                                        });
                                        testkinem24 =findViewById(R.id.a4);
                                        testkinem24.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.testkinem3);
                                            }
                                        });
                                    }
                                });
                                testkinem12 =findViewById(R.id.a2);
                                testkinem12.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        a++;
                                        setContentView(R.layout.testkinem2);
                                        testkinem21 =findViewById(R.id.a1);
                                        testkinem21.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.testkinem3);
                                            }
                                        });
                                        setContentView(R.layout.testkinem2);
                                        testkinem22 =findViewById(R.id.a2);
                                        testkinem22.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.testkinem3);
                                            }
                                        });
                                        testkinem23 =findViewById(R.id.a3);
                                        testkinem23.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                a++;
                                                setContentView(R.layout.testkinem3);
                                            }
                                        });
                                        testkinem24 =findViewById(R.id.a4);
                                        testkinem24.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.testkinem3);
                                            }
                                        });
                                    }
                                });
                                testkinem13 =findViewById(R.id.a3);
                                testkinem13.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        setContentView(R.layout.testkinem2);
                                        testkinem21 =findViewById(R.id.a1);
                                        testkinem21.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.testkinem3);
                                            }
                                        });
                                        setContentView(R.layout.testkinem2);
                                        testkinem22 =findViewById(R.id.a2);
                                        testkinem22.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.testkinem3);
                                            }
                                        });
                                        testkinem23 =findViewById(R.id.a3);
                                        testkinem23.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                a++;
                                                setContentView(R.layout.testkinem3);
                                            }
                                        });
                                        testkinem24 =findViewById(R.id.a4);
                                        testkinem24.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.testkinem3);
                                            }
                                        });
                                    }
                                });
                                testkinem14 =findViewById(R.id.a4);
                                testkinem14.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        setContentView(R.layout.testkinem2);
                                        testkinem21 =findViewById(R.id.a1);
                                        testkinem21.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.testkinem3);
                                            }
                                        });
                                        setContentView(R.layout.testkinem2);
                                        testkinem22 =findViewById(R.id.a2);
                                        testkinem22.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.testkinem3);
                                            }
                                        });
                                        testkinem23 =findViewById(R.id.a3);
                                        testkinem23.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                a++;
                                                setContentView(R.layout.testkinem3);
                                            }
                                        });
                                        testkinem24 =findViewById(R.id.a4);
                                        testkinem24.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setContentView(R.layout.testkinem3);
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
                dinam =findViewById(R.id.dinamika);
                dinam.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingInflatedId")
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.dinamika);
                        home = findViewById(R.id.home);
                        home.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        testdinam =findViewById(R.id.testdinam);
                        testdinam.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.testdinam);
                            }
                        });
                    }
                });
                termodinamika =findViewById(R.id.termodinamika);
                termodinamika.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingInflatedId")
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.termodinamika);
                        home = findViewById(R.id.home);
                        home.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        testtermo =findViewById(R.id.testtermo);
                        testtermo.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.testterm);
                            }
                        });
                    }
                });
                statika =findViewById(R.id.statika);
                statika.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingInflatedId")
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.statika);
                        home = findViewById(R.id.home);
                        home.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        teststatik =findViewById(R.id.teststatik);
                        teststatik.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.teststatik);
                            }
                        });
                    }
                });
                hidrostatika =findViewById(R.id.hidrostatika);
                hidrostatika.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingInflatedId")
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.hidrostatika);
                        home = findViewById(R.id.home);
                        home.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        testhidro =findViewById(R.id.testhidro);
                        testhidro.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.testhidrostatik);
                            }
                        });
                    }
                });
                ashxatanq =findViewById(R.id.ashxatanq);
                ashxatanq.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingInflatedId")
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.ashxatanq);
                        home = findViewById(R.id.home);
                        home.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        testashx =findViewById(R.id.testashx);
                        testashx.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.testashx);
                            }
                        });
                    }
                });
                impuls =findViewById(R.id.impuls);
                impuls.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingInflatedId")
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.impuls);
                        home = findViewById(R.id.home);
                        home.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        testimpuls =findViewById(R.id.testimp);
                        testimpuls.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.testimpuls);
                            }
                        });
                    }
                });
                elektrostatika =findViewById(R.id.elektroctatika);
                elektrostatika.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingInflatedId")
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.elektrostatika);
                        home = findViewById(R.id.home);
                        home.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        testelektro =findViewById(R.id.testelektro);
                        testelektro.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.testelektro);
                            }
                        });
                    }
                });
                eletricheski_tok =findViewById(R.id.elektrakan_tok);
                eletricheski_tok.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingInflatedId")
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.elektricheski_tok);
                        home = findViewById(R.id.home);
                        home.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        testelektrich =findViewById(R.id.testelektrich);
                        testelektrich.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.testelektrich);
                            }
                        });
                    }
                });
                kolebaniya =findViewById(R.id.kolebaniya);
                kolebaniya.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingInflatedId")
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.kolebanya);
                        home = findViewById(R.id.home);
                        home.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        testkol =findViewById(R.id.testkol);
                        testkol.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.testkol);
                            }
                        });
                    }
                });
                optika =findViewById(R.id.optika);
                optika.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingInflatedId")
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.optika);
                        home = findViewById(R.id.home);
                        home.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        });
                        testopt =findViewById(R.id.testopt);
                        testopt.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                setContentView(R.layout.testopt);
                            }
                        });
                    }
                });
            }

        });
        teorem = findViewById(R.id.teorem);
        teorem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.teorem);
                home = findViewById(R.id.home);
                home.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                });
                mexanika =findViewById(R.id.mexanika);
                mexanika.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingInflatedId")
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.mexanika);
                        home = findViewById(R.id.home);
                        home.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        });
                    }
                });
                molekulyarni_fizika =findViewById(R.id.molekulyarni_fizika);
                molekulyarni_fizika.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.molekulyarni);
                        home = findViewById(R.id.home);
                        home.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        });
                    }
                });
                elektrichestvo =findViewById(R.id.elektrichestvo);
                elektrichestvo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.elektrichistvo);
                        home = findViewById(R.id.home);
                        home.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        });
                    }
                });
                opt =findViewById(R.id.opt);
                opt.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("MissingInflatedId")
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.opt);
                        home = findViewById(R.id.home);
                        home.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        });
                    }
                });
                yaderni =findViewById(R.id.atomayin);
                yaderni.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.atomani_fizika);
                        home = findViewById(R.id.home);
                        home.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }
                        });
                    }
                });
            }
        });
        lezu = findViewById(R.id.lezu);
        lezu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.lezu);
                home = findViewById(R.id.home);
                home.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });
    }
}