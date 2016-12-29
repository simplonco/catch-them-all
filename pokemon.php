<?php
// version 1 of class Pokemon
class Pokemon {
    public $name;
    public $level;
    public $pv;
    public function attack($name) {
        echo $this->name." launch attack ".$name;
    }
}
// Create an object
$pikachu = new Pokemon;
// Set attributes of the object
$pikachu->name = "Pickachu";
$pikachu->level = 0;
$pikachu->pv = 60;
// Launch the attack "Thunderbolt"
$pikachu->attack("Thunderbolt");
