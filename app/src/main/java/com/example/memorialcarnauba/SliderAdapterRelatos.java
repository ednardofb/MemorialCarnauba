package com.example.memorialcarnauba;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapterRelatos  extends PagerAdapter {

    Context contextrelatos;
    LayoutInflater layoutInflaterrelatos;

    public SliderAdapterRelatos(Context context){
        this.contextrelatos = context;
    }


    //Arrays
    public int [] slide_imagesrelatos = {
            R.drawable.image_slide_relatos_claudia,
            R.drawable.image_slide_relatos_karlos,
            R.drawable.image_slide_relatos_maria,
            R.drawable.image_slide_relatos_mirna
    };

    public String[] slide_headingsrelatos ={
            "Claúdia Barbosa",
            "Karlos Lancasther",
            "Maria Irineuda de Oliveira",
            "Mirna Carla"
    };

    public String[] slide_descsrelatos ={
            "O Memorial representa para o mundo a expressão mais forte no que diz respeito a compreensão da natureza que envolve a palmeira mais rica e interessante do nosso pais, a carnaúba. O Memorial ainda desperta de forma relevante a proteção e continuidade da existência da referida palmeira. Tenho visto o reconhecimento do governo e das pessoas em geral, de forma merecida ao casal Afro e Deyse que tem dedicado suas vidas as atividade através das formações, e de práticas de artesanato com a palha e o talo da carnaúba.O Memorial ainda prima ao associados a capacitação nas áreas de empreendedorismo e valores humanos. Tenho muito orgulho em fazer parte desta equipe de sucesso.\" ",
            "Faço desse espaço um momento de recordação e de forma breve compartilho a minha lembrança do inicio desse equipamento. Em 2009 lá estava eu conversando com o Ambientalista Afro Negrão Moura Jr. o mesmo rabiscava um projeto de grande impacto para o município, se falava de artesões, artistas e de carnaúba.Depois de dois anos precisamente em maio de 2011 já me encontra inserido em um projeto que deu certo e hoje crianças, adolescentes, jovens, adultos e idosos fazem parte da história do MEMORIAL DA CARNAÚBA e assim Jaguaruana se destaca no que tange preservação, revitalização e incentivo ao ciclo produtivo da carnaubeira símbolo do Estado do Ceará.\" ",
            "O memorial da carnaúba representa a luta pela preservação dessa árvore símbolo de resistência, além de buscar a valorização das manifestações culturais que se entrelaçam aos carnaubais. Este equipamento permite que as novas gerações possam entender a importância do extrativismo da carnaúba para formação histórica do nosso estado, da nossa cidade.",
            "O Memorial da Carnaúba é um Ponto de Cultura que agrega oportunidade e aprendizado na valorização do meio ambiente, da espécie da Carnauba e sua cadeia produtiva. Um elo de resistência, difusão da importância da Carnaúba no Brasil afora e de fortalecimento na construção das práticas sociais, econômicas, culturais e políticas, despertando o respeito, o uso sustentável da espécie e a valorização do artesão e artesã, colaborando para o melhor viver em coletividade"
    };




    @Override
    public int getCount() {
        return slide_imagesrelatos.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){

        layoutInflaterrelatos = (LayoutInflater) contextrelatos.getSystemService(contextrelatos.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflaterrelatos.inflate(R.layout.slide_layout_relatos, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_imageRelatos);
        TextView slideHeading    = (TextView) view.findViewById(R.id.slide_headingRelatos);
        TextView slideDescription    = (TextView) view.findViewById(R.id.slide_descRelatos);

        slideImageView.setImageResource(slide_imagesrelatos[position]);
        slideHeading.setText(slide_headingsrelatos[position]);
        slideDescription.setText(slide_descsrelatos[position]);

        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((RelativeLayout)object);
    }

}
