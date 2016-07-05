package op.batyandswyat.fjat_shell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.mikepenz.iconics.typeface.FontAwesome;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Handle Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        new Drawer()
                .withActivity(this)
                .withToolbar(toolbar)
                .withActionBarDrawerToggle(true)
                .withHeader(R.layout.drawer_header)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName(R.string.info_fr1).withIcon(FontAwesome.Icon.faw_cog).withBadge("99").withIdentifier(1),
                        new PrimaryDrawerItem().withName(R.string.info_fr2).withIcon(FontAwesome.Icon.faw_cog).withBadge("6").withIdentifier(2),
                        new PrimaryDrawerItem().withName(R.string.info_fr3).withIcon(FontAwesome.Icon.faw_cog).withBadge("6").withIdentifier(3),
                        new PrimaryDrawerItem().withName(R.string.info_fr4).withIcon(FontAwesome.Icon.faw_cog).withBadge("6").withIdentifier(4),
                        new PrimaryDrawerItem().withName(R.string.info_fr5).withIcon(FontAwesome.Icon.faw_cog).withBadge("6").withIdentifier(5),
                        new PrimaryDrawerItem().withName(R.string.info_fr6).withIcon(FontAwesome.Icon.faw_cog).withBadge("6").withIdentifier(6),
                        new PrimaryDrawerItem().withName(R.string.info_fr7).withIcon(FontAwesome.Icon.faw_cog).withBadge("6").withIdentifier(7),
                        new PrimaryDrawerItem().withName(R.string.info_fr8).withIcon(FontAwesome.Icon.faw_cog).withBadge("6").withIdentifier(8),
                        new PrimaryDrawerItem().withName(R.string.info_fr9).withIcon(FontAwesome.Icon.faw_cog).withBadge("6").withIdentifier(9),
                        new PrimaryDrawerItem().withName(R.string.info_fr10).withIcon(FontAwesome.Icon.faw_cog).withBadge("6").withIdentifier(10)
                )
                .build();

    }

}
