package jp.suntech.c22010.mymenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ListView _lvMenu;

    private List<Map<String, Object>> _menuList;

    private static final String[] FROM = {"name", "price"};

    private static final int[] TO = {R.id.tvMenuNameRow, R.id.tvMenuPriceRow};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //画面部品ListViewを取得し、フィールドに格納。
        _lvMenu = findViewById(R.id.lvMenu);
        //定食メニューListオブジェクトをprivateメソッドを利用して用意し、フィールドに格納。
        _menuList = createTeishokuList();
        //SimpleAdapterを作成。
        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this, _menuList, R.layout.row, FROM, TO);
        //アダプタの登録。
        _lvMenu.setAdapter(adapter);
        //リストアップのリスナクラス登録。
        _lvMenu.setOnItemClickListener(new ListItemClickListener());
    }

    List<Map<String,Object>> createTeishokuList(){
        //定食メニューリスト用のListオブジェクトを用意
        List<Map<String, Object>> menuList = new ArrayList<>();
        //唐揚げ抵触のデータを格納するMapオブジェクトの用意とmenuListへのデータ登録
        Map<String, Object> menu = new HashMap<>();
        menu.put("name", "唐揚げ定食");
        menu.put("price", 800);
        menu.put("desc","若鳥のから揚げにサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        //ハンバーグ抵触のデータを格納するMapオブジェクトの用意とmenuListへのデータ登録
        menu = new HashMap<>();
        menu.put("name", "ハンバーグ定食");
        menu.put("price", 850);
        menu.put("desc", "手ごねハンバーグにサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name", "生姜焼き定食");
        menu.put("price", 850);
        menu.put("desc", "生姜焼きにサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "ステーキ定食");
        menu.put("price", 850);
        menu.put("desc", "ステーキにサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "野菜炒め定食");
        menu.put("price", 750);
        menu.put("desc", "野菜炒めにサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "とんかつ定食");
        menu.put("price", 900);
        menu.put("desc", "とんかつにサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "ミンチカツ定食");
        menu.put("price", 850);
        menu.put("desc", "ミンチカツにサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "チキンカツ定食");
        menu.put("price", 850);
        menu.put("desc", "チキンカツにサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "コロッケ定食");
        menu.put("price", 850);
        menu.put("desc", "コロッケにサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "回鍋肉定食");
        menu.put("price", 850);
        menu.put("desc", "回鍋肉にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "麻婆豆腐定食");
        menu.put("price", 850);
        menu.put("desc", "麻婆豆腐にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "青椒肉絲定食");
        menu.put("price", 850);
        menu.put("desc", "青椒肉絲にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "八宝菜定食");
        menu.put("price", 850);
        menu.put("desc", "八宝菜にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "酢豚定食");
        menu.put("price", 850);
        menu.put("desc", "酢豚にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "豚の角煮定食");
        menu.put("price", 950);
        menu.put("desc", "豚の角煮にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "焼き鳥定食");
        menu.put("price", 800);
        menu.put("desc", "焼き鳥にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "焼き魚定食");
        menu.put("price", 800);
        menu.put("desc", "焼き魚にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);
        menu = new HashMap<>();
        menu.put("name", "焼肉定食");
        menu.put("price", 900);
        menu.put("desc", "焼肉にサラダ、ご飯とお味噌汁が付きます。");
        menuList.add(menu);

        return menuList;
    }

    //リストがタップされた時の処理が記述されたメンバクラス
    private class ListItemClickListener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            //タップされた行のデータを取得
            Map<String, Object> item = (Map<String, Object>)parent.getItemAtPosition(position);

            String menuName = (String)item.get("name");
            Integer menuPrice = (Integer) item.get("price");

            //インテントオブジェクト作成
            Intent intent = new Intent(MainActivity.this, MenuThanksActivity.class);
            //第二画面に送るデータを格納
            intent.putExtra("menuName", menuName);
            //MenuThanksActivityでのデー受け取りと合わせるため、金額にここで円を追加する
            intent.putExtra("menuPrice", menuPrice+"円");

            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //メニューインフレータの取得
        MenuInflater inflater = getMenuInflater();
        //オプションメニュー用.xmlファイルをインフレート
        inflater.inflate(R.menu.menu_options_menu_list, menu);
        return true;
    }

    private List<Map<String, Object>> createCurryList(){
        List<Map<String, Object>> menuList = new ArrayList<>();
        //ビーフカレーのデータを格納するMapオブジェクトの容易とmenuListへのデータ登録
        Map<String, Object>menu = new HashMap<>();
        menu.put("name", "ビーフカレー");
        menu.put("price", 520);
        menu.put("desc", "特選スパイスを効かせた国産ビーフ100%のカレーです。");
        menuList.add(menu);

        //ポークカレー
        menu = new HashMap<>();
        menu.put("name", "ポークカレー");
        menu.put("price", 420);
        menu.put("desc", "特選スパイスを効かせた国産ポーク100%のカレーです。");
        menuList.add(menu);

        return menuList;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        boolean returnVal = true;

        int itemId = item.getItemId();

        if(itemId == R.id.menuListOptionTeishoku)
            _menuList = createTeishokuList();
        else if(itemId == R.id.menuListOptionCurry)
            _menuList = createCurryList();
        else {
            returnVal = super.onOptionsItemSelected(item);
        }
        //SimpleAdapterを選択されたメニューデータで生成。
        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this, _menuList,
                R.layout.row, FROM, TO);
        _lvMenu.setAdapter(adapter);
        return returnVal;
    }
}