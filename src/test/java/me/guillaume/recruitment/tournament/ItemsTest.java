package me.guillaume.recruitment.tournament;

import me.guillaume.recruitment.tournament.Fighter.EnumFighterWeapons;
import me.guillaume.recruitment.tournament.Item.Buckler;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ItemsTest {

    @Test
    public void test_if_buckler_absorb_damages(){
        Buckler buckler = new Buckler();
        buckler.incrementTurn();
        int attackValue = 5;
        assertThat(buckler.damageMultiplier(attackValue, null)).isEqualTo(0);

        buckler.incrementTurn();
        assertThat(buckler.damageMultiplier(attackValue, null)).isEqualTo(attackValue);
    }


    @Test
    public void test_if_buckler_break(){
        Buckler buckler = new Buckler();
        buckler.incrementTurn();
        int attackValue = 5;

        assertThat(buckler.damageMultiplier(attackValue, EnumFighterWeapons.AXE)).isEqualTo(0); // 1st blow
        assertThat(buckler.damageMultiplier(attackValue, EnumFighterWeapons.AXE)).isEqualTo(0); // 2nd blow
        assertThat(buckler.damageMultiplier(attackValue, EnumFighterWeapons.AXE)).isEqualTo(0); // buckler break
        assertThat(buckler.damageMultiplier(attackValue, EnumFighterWeapons.AXE)).isEqualTo(attackValue);

    }
}
