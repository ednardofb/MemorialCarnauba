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

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter (Context context){

        this.context = context;

   }

   //ARRAYS
    public int [] slide_images = {
            R.drawable.negrao,
            R.drawable.dai
   };

    public String[] slide_headings ={
            "Afro Moura Negrão Jr",
            "Daisy De Miranda Rocha"
    };

    public String[] slide_descs ={
            "Afro M. Negrão Júnior,produtor Cultural e artesão, Publicitário e ambientalista com atuação em diversos segmentos e veículos na área de Comunicação e Marketing. Desde 1979 atua seus trabalhos voltados para a área Cultural e artística de Eventos em geral, no planejamento, elaboração, execução de projetos, captação de recursos, planos de trabalhos,prestação de contas, execução e gerenciamento do projeto, de acordo com o planejamento estabelecido. Além de presidente do Memorial Carnauba e da Associação dos Moradores Sitio Volta atua como coordenador executivo do PONTO DE CULTURA Armazém da Carnaúba: Arte e Memoria desde 2011 e busca politicas públicas e administra trabalhos sócio ambientais e artísticos onde as comunidades envolvidas participam e desenvolvem iniciativas importantes para o seu fortalecimento. A responsabilidade em transformar as dificuldades em valores faz dos movimentos culturais um elo importante entreartistas, artesões, produtores rurais que cuidam do seu habitat. Afro sempre buscando inovações e a valorização do terceiro Setor como braço direito do Governo Estadual.",
            "Daisy de Miranda Rocha iniciou suas atividades em 1987 nas ações artísticas, culturais e para o turismo. Formada em turismo iniciou nas comunidades com o turismo rural no Ceará, principalmente nas zonas rurais de maior vulnerabilidade e falta de recursos e de políticas públicas que assistem os moradores carentes e com necessidades especiais . Como voluntária em projetos e ações em Jaguaruana e na região do Vale do Jaguaribe, organizando diversos trabalhos, participações em conferências, feiras, seminários e reuniões de grupos de extrativistas, artistas, artesãos e produtores rurais com a missão de organizar a produção e expor as peças produzidas e confeccionadas no artesanato da palha ,do talo e dopapel da carnaúba no Ceará. Os projetos e editais aprovados qualificaram e multiplicaram os conhecimentos e os saberes populares. Em 1990 como produtora cultural organizou diversos trabalhos gráfico-visual como a revista Ceará Magazine e outras, guias turísticos, livros e editoriais sobre o Ceará. Participou de diversos projetos como: Fundação do Memorial Carnaúba em 2011 em Jaguaruana, em um prédio centenário alugado no centro da cidade e reformado para esse fim cultural, onde iniciou o maior projeto de valorização da cultura da carnaúba, onde foram organizados muitos momentos para a classe artística do Vale do Jaguaribe com o envolvimento e participação dos municípios de Russas, Aracati, Quixeré , Palhano, Limoeiro do Norte, Itaiçaba e Jaguaruana."
    };

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout_quemfaz, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_descs[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((RelativeLayout)object);
    }
}
