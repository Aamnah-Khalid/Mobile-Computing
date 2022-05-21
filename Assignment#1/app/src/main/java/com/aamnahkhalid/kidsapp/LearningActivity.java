package com.aamnahkhalid.kidsapp;

import android.content.Intent;
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
        l.setOnClickListener(this);

        m=findViewById(R.id.btn_M);
        m.setOnClickListener(this);

        n=findViewById(R.id.btn_n);
        n.setOnClickListener(this);

        o=findViewById(R.id.btn_o);
        o.setOnClickListener(this);

        p=findViewById(R.id.btn_p);
        p.setOnClickListener(this);

        q=findViewById(R.id.btn_q);
        q.setOnClickListener(this);

        r=findViewById(R.id.btn_r);
        r.setOnClickListener(this);

        s=findViewById(R.id.btn_s);
        s.setOnClickListener(this);

        t=findViewById(R.id.btn_t);
        t.setOnClickListener(this);

        u=findViewById(R.id.btn_u);
        u.setOnClickListener(this);

        v=findViewById(R.id.btn_v);
        v.setOnClickListener(this);

        w=findViewById(R.id.btn_w);
        w.setOnClickListener(this);

        x=findViewById(R.id.btn_x);
        x.setOnClickListener(this);

        y=findViewById(R.id.btn_y);
        y.setOnClickListener(this);

        z=findViewById(R.id.btn_z);
        z.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(LearningActivity.this,AlphabetActivity.class);
        switch (view.getId()){
            case R.id.btn_a:
                intent.putExtra("input","a");
                break;
            case R.id.btn_b:
                intent.putExtra("input","b");
                break;
            case R.id.btn_c:
                intent.putExtra("input","c");
                break;
            case R.id.btn_d:
                intent.putExtra("input","d");
                break;
            case R.id.btn_e:
                intent.putExtra("input","e");
                break;
            case R.id.btn_f:
                intent.putExtra("input","f");
                break;
            case R.id.btn_g:
                intent.putExtra("input","g");
                break;
            case R.id.btn_h:
                intent.putExtra("input","h");
                break;
            case R.id.btn_i:
                intent.putExtra("input","i");
                break;
            case R.id.btn_j:
                intent.putExtra("input","j");
                break;
            case R.id.btn_k:
                intent.putExtra("input","k");
                break;
            case R.id.btn_l:
                intent.putExtra("input","l");
                break;
            case R.id.btn_M:
                intent.putExtra("input","m");
                break;
            case R.id.btn_n:
                intent.putExtra("input","n");
                break;
            case R.id.btn_o:
                intent.putExtra("input","o");
                break;
            case R.id.btn_p:
                intent.putExtra("input","p");
                break;
            case R.id.btn_q:
                intent.putExtra("input","q");
                break;
            case R.id.btn_r:
                intent.putExtra("input","r");
                break;
            case R.id.btn_s:
                intent.putExtra("input","s");
                break;
            case R.id.btn_t:
                intent.putExtra("input","t");
                break;
            case R.id.btn_u:
                intent.putExtra("input","u");
                break;
            case R.id.btn_v:
                intent.putExtra("input","v");
                break;
            case R.id.btn_w:
                intent.putExtra("input","w");
                break;
            case R.id.btn_x:
                intent.putExtra("input","x");
                break;
            case R.id.btn_y:
                intent.putExtra("input","y");
                break;
            default:
                intent.putExtra("input","z");
        }
        startActivity(intent);

    }
}