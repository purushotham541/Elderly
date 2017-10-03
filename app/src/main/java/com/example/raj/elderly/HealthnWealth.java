package com.example.raj.elderly;

import android.Manifest;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URI;

public class HealthnWealth extends AppCompatActivity
{
    String names[] = {"Physiotheraphy", "Yoga and meditation", "Monthly checkup","Physical fitness"};
    int images[] = {R.drawable.lion, R.drawable.elephant, R.drawable.tiger, R.drawable.rabbit};
    ListView lv;
    TextView textmsg,Whatsapp,Call;
    int temp = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthn_wealth);
        lv = (ListView) findViewById(R.id.lv);
        CustumAdapter aa = new CustumAdapter();
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                temp = i;
                if (temp == 0)
                {
                    //Toast.makeText(getApplicationContext(), "Aaaaaaaaaaaaaa", Toast.LENGTH_SHORT).show();
                    LayoutInflater li = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                    View v1 = li.inflate(R.layout.custumdailouge, null, false);
                     textmsg = (TextView) v1.findViewById(R.id.TextMsg);
                     Whatsapp = (TextView) v1.findViewById(R.id.Whatsapp);
                      Call = (TextView) v1.findViewById(R.id.Call);


                    AlertDialog.Builder adb = new AlertDialog.Builder(HealthnWealth.this);
                    adb.setView(v1);
                    final AlertDialog ad = adb.create();
                    ad.show();
                    textmsg.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(HealthnWealth.this, "TextMsggggggg", Toast.LENGTH_SHORT).show();
                            //Write your logic..........
                        }
                    });
                    Call.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Toast.makeText(getApplicationContext(),"Voice Call",Toast.LENGTH_SHORT).show();

                            Uri uri=Uri.parse("tel:8125251050");
                            Intent i=new Intent(Intent.ACTION_CALL,uri);
                            startActivity(i);

                        }
                    });
                    Whatsapp.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Toast.makeText(getApplicationContext(),"Whatsapp",Toast.LENGTH_SHORT).show();
                            Intent sendIntent = new Intent();
                            sendIntent.setAction(Intent.ACTION_SEND);
                            sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                            sendIntent.setType("text/plain");
                            sendIntent.setPackage("com.whatsapp");
                            startActivity(Intent.createChooser(sendIntent, ""));
                            startActivity(sendIntent);
                        }
                    });



                }
                else if (temp == 1)
                {
                    LayoutInflater li = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                    View v1 = li.inflate(R.layout.custumdailouge, null, false);
                    textmsg = (TextView) v1.findViewById(R.id.TextMsg);
                    Whatsapp = (TextView) v1.findViewById(R.id.Whatsapp);
                    Call = (TextView) v1.findViewById(R.id.Call);
                    AlertDialog.Builder adb = new AlertDialog.Builder(HealthnWealth.this);
                    adb.setView(v1);
                    final AlertDialog ad = adb.create();
                    ad.show();
                    textmsg.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Toast.makeText(HealthnWealth.this, "TextMsggggggg", Toast.LENGTH_SHORT).show();
                            //Write your logic..........
                        }
                    });
                    Call.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Toast.makeText(getApplicationContext(),"Voice Call",Toast.LENGTH_SHORT).show();

                            Uri uri=Uri.parse("tel:8125251050");
                            Intent i=new Intent(Intent.ACTION_CALL,uri);
                            startActivity(i);

                        }
                    });
                    Whatsapp.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Toast.makeText(getApplicationContext(),"Whatsapp",Toast.LENGTH_SHORT).show();
                            Intent sendIntent = new Intent();
                            sendIntent.setAction(Intent.ACTION_SEND);
                            sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                            sendIntent.setType("text/plain");
                            sendIntent.setPackage("com.whatsapp");
                            startActivity(Intent.createChooser(sendIntent, ""));
                            startActivity(sendIntent);
                        }
                    });

                }
                else if (temp == 2)
                {
                    LayoutInflater li = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                    View v1 = li.inflate(R.layout.custumdailouge, null, false);
                     textmsg = (TextView) v1.findViewById(R.id.TextMsg);
                     Whatsapp = (TextView) v1.findViewById(R.id.Whatsapp);
                     Call = (TextView) v1.findViewById(R.id.Call);
                    AlertDialog.Builder adb = new AlertDialog.Builder(HealthnWealth.this);
                    adb.setView(v1);
                    final AlertDialog ad = adb.create();
                    ad.show();
                    textmsg.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Toast.makeText(HealthnWealth.this, "TextMsggggggg", Toast.LENGTH_SHORT).show();
                            //Write your logic..........
                        }
                    });
                    Call.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Toast.makeText(getApplicationContext(),"Voice Call",Toast.LENGTH_SHORT).show();

                            Uri uri=Uri.parse("tel:8125251050");
                            Intent i=new Intent(Intent.ACTION_CALL,uri);
                            startActivity(i);

                        }
                    });
                    Whatsapp.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Toast.makeText(getApplicationContext(),"Whatsapp",Toast.LENGTH_SHORT).show();
                            Intent sendIntent = new Intent();
                            sendIntent.setAction(Intent.ACTION_SEND);
                            sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                            sendIntent.setType("text/plain");
                            sendIntent.setPackage("com.whatsapp");
                            startActivity(Intent.createChooser(sendIntent, ""));
                            startActivity(sendIntent);
                        }
                    });

                }
                else if (temp == 3)
                {
                    //Toast.makeText(getApplicationContext(), "Bbbbbbbbbbbbbb", Toast.LENGTH_SHORT).show();
                    LayoutInflater li = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                    View v1 = li.inflate(R.layout.custumdailouge, null, false);
                    textmsg = (TextView) v1.findViewById(R.id.TextMsg);
                    Whatsapp = (TextView) v1.findViewById(R.id.Whatsapp);
                    Call = (TextView) v1.findViewById(R.id.Call);
                    AlertDialog.Builder adb = new AlertDialog.Builder(HealthnWealth.this);
                    adb.setView(v1);
                    final AlertDialog ad = adb.create();
                    ad.show();
                    textmsg.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Toast.makeText(HealthnWealth.this, "TextMsggggggg", Toast.LENGTH_SHORT).show();
                            //Write your logic..........
                        }
                    });
                    Call.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Toast.makeText(getApplicationContext(),"Voice Call",Toast.LENGTH_SHORT).show();

                            Uri uri=Uri.parse("tel:8125251050");
                            Intent i=new Intent(Intent.ACTION_CALL,uri);
                            startActivity(i);

                        }
                    });
                    Whatsapp.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            Toast.makeText(getApplicationContext(),"Whatsapp",Toast.LENGTH_SHORT).show();
                            Intent sendIntent = new Intent();
                            sendIntent.setAction(Intent.ACTION_SEND);
                            sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                            sendIntent.setType("text/plain");
                            sendIntent.setPackage("com.whatsapp");
                            startActivity(Intent.createChooser(sendIntent, ""));
                            startActivity(sendIntent);
                        }
                    });

                }


            }
        });

    }

    class CustumAdapter extends BaseAdapter
    {

        @Override
        public int getCount()
        {
            return images.length;
        }

        @Override
        public Object getItem(int i)
        {
            return null;
        }

        @Override
        public long getItemId(int i)
        {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup)
        {
            view = getLayoutInflater().inflate(R.layout.mylist, null);
            TextView tv = (TextView) view.findViewById(R.id.tv);
            ImageView iv = (ImageView) view.findViewById(R.id.iv);
            iv.setImageResource(images[i]);
            tv.setText(names[i]);
            return view;
        }
    }
}
