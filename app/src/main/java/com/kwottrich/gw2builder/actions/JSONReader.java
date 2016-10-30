package com.kwottrich.gw2builder.actions;

import com.google.gson.Gson;
import com.kwottrich.gw2builder.data.skills.Skill;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.concurrent.Callable;

/**
 * Created by kenny on 9/2/2016.
 */
public class JSONReader implements Callable<Skill> {
    private static final String SKILL_JSON = "{\"name\":\"Magnetic Wave\",\"facts\":[{\"text\":\"Recharge\",\"type\":\"Recharge\",\"icon\":\"https://render.guildwars2.com/file/D767B963D120F077C3B163A05DC05A7317D7DB70/156651.png\",\"value\":25},{\"text\":\"Damage\",\"type\":\"Damage\",\"icon\":\"https://render.guildwars2.com/file/61AA4919C4A7990903241B680A69530121E994C7/156657.png\",\"hit_count\":1},{\"text\":\"Apply Buff/Condition\",\"type\":\"Buff\",\"icon\":\"https://render.guildwars2.com/file/070325E519C178D502A8160523766070D30C0C19/102838.png\",\"duration\":5,\"status\":\"Crippled\",\"description\":\"Movement speed decreased by 50%; stacks duration.\",\"apply_count\":1},{\"text\":\"Reflection Duration\",\"type\":\"Time\",\"icon\":\"https://render.guildwars2.com/file/7B2193ACCF77E56C13E608191B082D68AA0FAA71/156659.png\",\"duration\":3},{\"text\":\"Radius\",\"type\":\"Distance\",\"icon\":\"https://render.guildwars2.com/file/B0CD8077991E4FB1622D2930337ED7F9B54211D5/156665.png\",\"distance\":300},{\"text\":\"Number of Targets\",\"type\":\"Number\",\"icon\":\"https://render.guildwars2.com/file/9352ED3244417304995F26CB01AE76BB7E547052/156661.png\",\"value\":5},{\"text\":\"Combo Finisher\",\"type\":\"ComboFinisher\",\"icon\":\"https://render.guildwars2.com/file/A513F3653D33FBA4220D2D307799F8A327A36A3B/156656.png\",\"percent\":100,\"finisher_type\":\"Blast\"}],\"description\":\"Damage foes, cure three of your conditions, and reflect projectiles with a magnetic surge.\",\"icon\":\"https://render.guildwars2.com/file/BBF16D6BF9CDA755420759F7D5F8D3FF6B2065DA/103343.png\",\"type\":\"Weapon\",\"weapon_type\":\"Focus\",\"attunement\":\"Earth\",\"professions\":[\"Elementalist\"],\"slot\":\"Weapon_4\",\"flags\":[],\"id\":5555,\"chat_link\":\"[&BrMVAAA=]\"}";
    private static final String SKILL_URL = "https://api.guildwars2.com/v2/skills/";

    public void testGson() {
        Gson gson = new Gson();
        Skill magneticWave = gson.fromJson(SKILL_JSON, Skill.class);
        System.out.println(magneticWave.getDescription());
    }

    public Skill testWebGson() {
        Gson gson = new Gson();
        Skill skill = null;
        try {
            Reader reader = new InputStreamReader((InputStream) new URL(SKILL_URL+"5555").getContent(), "UTF-8");
            skill = gson.fromJson(reader, Skill.class);
            System.err.println(skill.getName() + ": " + skill.getDescription());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return skill;
    }

    @Override
    public Skill call() throws Exception {
        return testWebGson();
    }
}
