package com.markus.cinemaua.bottomnav.show;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.markus.cinemaua.Movie;
import com.markus.cinemaua.MovieDetailActivity;
import com.markus.cinemaua.MoviesAdapter;
import com.markus.cinemaua.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShowFragment extends Fragment implements MoviesAdapter.OnMovieClickListener {

    private RecyclerView moviesRecyclerView;
    private MoviesAdapter moviesAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shows, container, false);

        moviesRecyclerView = view.findViewById(R.id.moviesRecyclerView);
        moviesRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Movie> movieList = createMovieList();
        moviesAdapter = new MoviesAdapter(movieList);
        moviesAdapter.setOnMovieClickListener(this);
        moviesRecyclerView.setAdapter(moviesAdapter);

        return view;
    }

    private List<Movie> createMovieList() {
        List<String> showtimes = Arrays.asList("10:00 AM", "01:00 PM", "04:00 PM", "07:00 PM");
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Думками навиворіт 2", "0/10", "https://multiplex.ua/images/48/c7/48c7764c08959b42f189b79d8547c472.jpeg", "Продовження мультфільму від Disney та Pixar повертає глядачів у свідомість новоспеченої підлітки Райлі. Головна контора у голові дівчини зіштовхується з раптовим виселенням, щоб звільнити місце для чогось вкрай несподіваного: нових Емоцій! Радість, Печаль, Гнів, Страх та Відраза вже давно успішно працюють разом. Тому вони не знають, що відчувати, коли зʼявляється Тривожність. І, схоже, вона прийшла не сама.", showtimes));
        movies.add(new Movie("Ґарфілд в кіно", "9/10", "https://multiplex.ua/images/e9/2e/e92efb46daef6d74b0ff512609204ea1.jpeg", "Улюбленець мільйонів – рудий кіт Ґарфілд повертається на великі екрани! Він ненавидить понеділки, обожнює лазанью і кожен день проводить біля телевізора. Проте цього разу на нього чекає несподівана пригода за межами дому. Після випадкової зустрічі зі своїм давно загубленим батьком — замурзаним вуличним котом — Ґарфілд і його друг Оді змушені залишити безтурботне життя та відправитися у шалену мандрівку.", showtimes));
        movies.add(new Movie("Наглядачі", "9/10", "https://multiplex.ua/images/d0/0d/d00dc56ae05b4118d5b1c11d926d2be8.jpeg", "Від продюсера М. Найта Ш'ямалана та режисерки Ішани Найт Шʼямалан виходить фільм «Наглядачі», знятий за мотивами роману А.М. Шайна. Історія розповідає про Міну, 28-річну художницю, яка опинилася у величезному лісі на заході Ірландії. Притулок, який вона знайшла разом із трьома незнайомцями, перетворюється на пастку. Щоночі за ними спостерігають і переслідують таємничі істоти. Їх не видно, але вони бачать усе.", showtimes));
        movies.add(new Movie("Лампо: Вірний Пес", "7/10", "https://multiplex.ua/images/29/a7/29a740612d03867846cab2fa10cafaed.jpeg", "Хто сказав, що собаки не можуть подорожувати? Лампо – унікальний пес, якому вдалося стати одним з найвідоміших мандрівників Європи! Ще цуценям він оселився на залізничній станції і подорожував країною. Одного разу начальник станції забрав його додому, і пес нарешті знайшов родину. Ця унікальна історія про дружбу розтопить будь-яке серце.", showtimes));
        movies.add(new Movie("Уявні друзі", "5/10", "https://multiplex.ua/images/82/01/8201ce4090e9c798015b293380b35682.jpeg", "Емілі Блант та Раян Рейнольдс у новій яскравій історії! Пориньте у захопливий світ від режисера Джона Красінські, в який важко повірити, поки не побачиш на власні очі.", showtimes));
        movies.add(new Movie("Будинок «Слово». Нескінчений роман", "6/10", "https://multiplex.ua/images/97/ec/97ec68371c11d0be4e654228d80de95c.jpeg", "1927. Радянська Україна. За наказом Сталіна у Харкові збудовано кооперативний будинок «Слово». Найвидатніших українських письменників заселяють у комфортні квартири. Усі вони стали учасниками експерименту, спрямованого на виведення нового типу радянського письменника та тотальний контроль над процесом творчості з метою створення єдиного художнього методу соціалістичного реалізму та не кожен з письменників погоджується оспівувати культ Сталіна. Неочікувано для мешканців будинку «Слово» до них підселяють нікому не відомого молодого письменника Володимира Акімова. Хто він? Ніхто не знає. З його появою в будинку «Слово» починають розгортатися дивні події, про що й досі мовчать його стіни. Історія заснована на реальних подіях.", showtimes));
        movies.add(new Movie("Таро", "10/10", "https://multiplex.ua/images/d8/96/d896a20b3bee46f2914786a5e52248da.jpeg", "Коли група друзів порушує священне правило ворожіння на Таро — ніколи не користуватися чужою колодою — вони несвідомо випускають на волю зло, що ховається в картах. Тепер їм доведеться постати перед долею та вступити у перегони зі смертю, щоб уникнути майбутнього, передбаченого ворожінням.", showtimes));
        return movies;
    }

    public void onMovieClick(Movie movie) {
        Intent intent = new Intent(getContext(), MovieDetailActivity.class);
        intent.putExtra("title", movie.getTitle());
        intent.putExtra("description", movie.getDescription());
        intent.putStringArrayListExtra("showtimes", new ArrayList<>(movie.getShowtimes()));
        intent.putExtra("posterUrl", movie.getPosterUrl());
        startActivity(intent);
    }
}
