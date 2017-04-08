package view;

import java.util.Random;

/**
 *
 */
public class RoomDescriptors {
    private static Random random = new Random();
    private static final String[] rooms = {
            "Welcome Adventurers, to your DOOM!!",
            "This room is cold and dark. You think you hear a sound in the corner",
            "You have found another room, it is lined with beautiful tapestries, except one ugly floormat hung on the wall",
            "This room has grey stone walls, ceiling, and floor. There is a broken iron chandelier in the middle of it. \n" +
            "The candles on the chandelier are only half burnt. There is a powerful echo in the room which amplifies all sounds made within.",
            "This room is completely black. Within the black are stars. Millions of stars. Stepping into the room one gets the uncanny impression of floating in deep space. It is however a perfectly normal room otherwise.",
            "The walls of this room are covered with ancient tapestries. They are rotten and full of carpet bugs. The floor is made of wood, which has somehow survived in perfectly pristine condition.",
            "This room is filled with doors of all shapes and sizes. There are even a few window frames, and one comfortable couch.",
            "This room has a checkerboard pattern on its floor in black and white, and a similar pattern on its ceiling in red and blue. Someone has left a mop in a bucket of soapy water near the entrance the party comes in from.",
            "This room is filled with sawdust. Walking into it stirs it and it begins to float around. The sawdust sticks to anything it touches, like sawdust does.",
            "This room is fully padded with a white soft material.",
            "There is an odd smell in this room, as if someone had recently been cooking there. However, the floor is polished clean marble and the walls and ceiling are perfectly white stone.",
            "This room feels friendly. It is decorated in a red rose pattern all throughout. There is a deck of playing cards on a rose patterned table here. The playing cards all depict different kinds of roses.",
            "The floor of this room is covered in images of feathers. The walls are painted with images of wildlife. The ceiling is one huge red sun.",
            "This room feels too large for its size, as if someone had crammed a much larger room into the space it now occupies. ",
            "There are green plants growing down from the ceiling. The ceiling looks to be made of soil, though none of it appears to be falling down.",
            "This room has a bouncy floor made of somekind of red material. The ceiling isn't low enough for anyone to bang their head on it by accident.",
            "This room has several empty cubicles. There are windows on the walls, but they are empty and only show the wall they hang from.",
            "There are strange faraway sounds of people talking in this room. The sounds can not be deciphered. The room is completely empty.",
            "There is a sword practise doll made of wood affixed to the center of this room. It is full of cuts and scrapes. There are no swords anywhere.",
            "This room has about two thousand cardboard boxes. None of them contain anything, except perhaps more boxes.",
            "This room has two chests. They are made of lead, and apparently stuck to floor, as no-one will be able to lift them. One of them contains a doll which looks like a wizard, and the other one is empty.",
            "The walls of this room are full of text in red ink. The ink has worn out, and not one word is legible.",
            "This room contains a sword stand. There are five places for swords, but only two swords. The first is so used it has turned blunt, and the other is broken in half.",
            "This room has walls of dark jagged rock. The ceiling has been painted black. The paint is still wet, and it is slowly dripping down to the grey floor.",
            "This room is oval in shape with no distinct corners. The floor feels gritty beneath your feet, and the walls are painted with a continuous fresco of a seascape that surrounds you. Oddly, you feel that if you stay here for any time you'll become seasick.",
            "The floor of this room is littered with the shards of thousands of bits of broken crockery. There doesn't seem to be any way to walk across without the bits crunching under foot.",
            "The ceiling of this room is an arching dome with hundreds of tiny round openings in it, apparently air vents or perhaps speaking tubes. Faint whispers can be heard as you pass, but they are so garbled together that it's impossible to make out what any are saying.",
            "The floor before you is sagging and cracked, as if the supports beneath it had been broken. (Balance check, DC 10 when crossing) There is a relatively clear path through, though not a straight one.",
            "The walls of this room are lined with book shelves, though where the books might be you have no clue. The shelves appear to have been recently dusted.",
            "This room is almost completely filled by an aquarium in the middle of it. There are plants living in it, but they have grown so thick that it is impossible to tell whether there is anything else living inside.",
            "The walls of this room have been decorated with different coloured marble eyes. They all seem to stare at anyone entering, but this is only a feeling one gets.",
            "This room is dark. Really really dark. Any light source, magical or otherwise, which is brought into this room only illuminates it in a five foot radius. There is a human skeleton lying in the middle of the floor. It has a non-magical ring on its one remaining finger.",
            "This room contains a few dusty bathtubs. A couple of them are hooked up to pipes coming from the walls. All of them are dry, and nothing comes from the pipes if someone tries them.",
            "The floor of this room is covered in marble tiles. The tiles have different coloured numbers on them, but these seem completely random. Walking on any of the tiles makes them break, and the person who did so falls a half a feet down to the real floor (and receives no damage).",
            "Stepping into this room is like entering a desert during a high sun. The walls are a faded yellow, and the floor has a sandlike pattern. The ceiling is a bright white. Staying in this room for longer than 5 minutes makes you feel parched.",
            "This room eats all sounds. Nothing can be heard while within, and no sound can be made. There is a pedestal by the side of the room. On it is an emerald. If someone takes the emerald out of the room it breaks. Breaking the emerald dispels the sound eating effect.",
            "The floor of this room is wildly uneven. Standing on one side one gets the impression that the other side is impossibly small, and vice versa.",
            "This room makes everyone entering it feel claustrophobic. The walls feel like they are constantly closing in, and ceiling looks menacing. It's perfectly safe to be there.",
            "This room is a raging inferno of fire. It isn't magical, and it will hurt. The magical effect of the room is in keeping the fire contained inside it. Carefully and slowly walking into the room one will realize that there is a safe narrow path inside which will take you to the other exit(s).",
            "This room is decorated like the inside of an arabian tent. The beautiful fabrics used as decoration each have their own exotic scent.",
            "The floor of this room is littered with pencils and partially finished sketches of the same beautiful woman. Each picture is missing a different part of her.",
            "The floor of this room is slightly damp. The room is entirely violet.",
            "This room feels ancient. It looks like the inside of a castle tower.",
            "There is a golden statue of a terrifying demon in this room. The statue is much too big to be carried out, and the gold is fake.",
            "There are so many carpets of various kind on the floor of this room that simply getting into the room is a bit hard.",
            "This room is a library. All of the books are journals of a man named Ekhnaton. If anyone tries to read even one of them they will fall asleep. The journals are mindnumbingly boring. The sleep is non-magical, and waking the person is simple.",
            "This room contains a railroad which connects the entrances. There is a small minecart on the track near where the party comes in. The track is slightly rusted, and walking is faster than using the cart.",
            "The ceiling of this room is so low that to get through it the largest member of the party needs to bend down slightly.",
            "This room is completely empty save for a key on the floor near the opposite entrance.",
            "There are small cages in this room. In the cages are snakes. The snakes can easily escape through the bars if they so choose. The snakes are non-poisonous and harmless. There are lots of dead mice outside the cages.",
            "This room is a labyrinth of clear glass.",
            "This room is very muddy. There are several shovels and buckets in the mud.",
            "The doors, floor, ceiling, and walls of this room are all a mirror. Breaking a part of the mirror surface reveals small lockers all around the room. None of them are locked. They contain buttons, a couple of coins, needles, thread, tiny picture frames, non-magical rings and amulets, and all sorts of other knick knacks.",
            "This room is made of rusted iron. If one searches through the scrap on the floor he may find a usable hammer.",
            "There is a mist crawling across the floor of this room. It moves like a wild sea. Above the mist hang tiny clouds of smoke. Kneeling into the mist one gets the impression of being underwater.",
            "This room looks like a living room, but there is no furniture in it, only outlines between gathering dust where furniture used be. The walls used to be full of paintings, but they've been removed as well.",
            "This room is filled with burning candles, but they do not seem to be burning down. Extinguishing one extinguishes all of them, and none of them can no longer be lit after that.",
            "In this room there is a strong wind. The wind always seems to be against the direction one is travelling, and all movement speeds are halved while here.",
            "This room has a puzzle floor. The floor tiles are on a track, and can be moved around.",
            "This room has been painted in tiger stripes. It contains a drum set.",
            "This room looks like the storage room of a ceramics shop. There are shelves full of all kids of plates, mugs, teapots, kettles, pots, pans, jugs, and the like.",
            "There is a monkey in this room. When the party enters, the monkey says \"Ug?\" and runs away. There are banana peels on the floor.",
            "This room contains a library, but all of the books are empty. None of them even have titles.",
            "This room has a black and white checkerboard pattern on the floor, and is separated into several sections by large red curtains."
    };
    public static String getRandomRoom() {
        int i = random.nextInt(rooms.length + 1);
        return rooms[i];
    }
}
