package com.aamnahkhalid.kidsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearningActivity extends AppCompatActivity implements View.OnClickListener{

    Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        a=findViewById(R.id.btn_a);
        a.setOnClickListener(this);

        b=findViewById(R.id.btn_b);
        b.setOnClickListener(this);

        c=findViewById(R.id.btn_c);
        c.setOnClickListener(this);

        d=findViewById(R.id.btn_d);
        d.setOnClickListener(this);

        e=findViewById(R.id.btn_e);
        e.setOnClickListener(this);

        f=findViewById(R.id.btn_f);
        f.setOnClickListener(this);

        g=findViewById(R.id.btn_g);
        g.setOnClickListener(this);

        h=findViewById(R.id.btn_h);
        h.setOnClickListener(this);

        i=findViewById(R.id.btn_i);
        i.setOnClickListener(this);

        j=findViewById(R.id.btn_j);
        j.setOnClickListener(this);

        k=findViewById(R.id.btn_k);
        k.setOnClickListener(this);

        l=findViewById(R.id.btn_l);
        a.setOnClickListener(this);

        m=findViewById(R.id.btn_M);
        a.setOnClickListener(this);

        n=findViewById(R.id.btn_n);
        a.setOnClickListener(this);

        o=findViewById(R.id.btn_o);
        a.setOnClickListener(this);

        p=findViewById(R.id.btn_p);
        a.setOnClickListener(this);

        q=findViewById(R.id.btn_q);
        a.setOnClickListener(this);

        r=findViewById(R.id.btn_r);
        a.setOnClickListener(this);

        s=findViewById(R.id.btn_s);
        a.setOnClickListener(this);

        t=findViewById(R.id.btn_t);
        a.setOnClickListener(this);

        u=findViewById(R.id.btn_u);
        a.setOnClickListener(this);

        v=findViewById(R.id.btn_v);
        a.setOnClickListener(this);

        w=findViewById(R.id.btn_w);
        a.setOnClickListener(this);

        x=findViewById(R.id.btn_x);
        a.setOnClickListener(this);

        y=findViewById(R.id.btn_y);
        a.setOnClickListener(this);

        z=findViewById(R.id.btn_z);
        a.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}