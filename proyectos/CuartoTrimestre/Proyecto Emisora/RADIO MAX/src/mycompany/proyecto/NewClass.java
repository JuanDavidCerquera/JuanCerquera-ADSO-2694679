/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompany.proyecto;

import mycompany.proyecto.interfaz.ElegirCanciones;
import mycompany.proyecto.interfaz.Inicio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan
 */
public class NewClass {
        public static List<Artista> artistas = new ArrayList<>();
        public static  List<Cancion> canciones = new ArrayList<>();
        public static List<Boleta> boleta = new ArrayList<>();
        public static List<Usuario> usuario = new ArrayList<>();
    
    public static void main(String[] args) {
        //hacer un boolean en lista persona para saber si ya voto o no
        //de no ser asi podran votar varias veces
        ElegirCanciones pan =new ElegirCanciones();
        pan.setVisible(false);
        Inicio in = new Inicio();
        in.setVisible(true);
        artistas.add(new Artista("Leonardo da Vinci",0));
        artistas.add(new Artista("Van Gogh",1));
        artistas.add(new Artista("Pablo Picasso",2));
        artistas.add(new Artista("Michelangelo",3));
        artistas.add(new Artista("Salvador Dalí",4));
        artistas.add(new Artista("Frida Kahlo",5));
        artistas.add(new Artista("Andy Warhol",6));
        artistas.add(new Artista("Claude Monet",7));
        artistas.add(new Artista("Georgia O'Keeffe",8));
        artistas.add(new Artista("Jackson Pollock",9));
        artistas.add(new Artista("Gustav Klimt",10));
        artistas.add(new Artista("Rembrandt",12));
        artistas.add(new Artista("Rene Magritte",13));
        /*artistas.add(new Artista("Edvard Munch",14));
        artistas.add(new Artista("Henri Matisse",15));
        artistas.add(new Artista("Joan Miró",16));
        artistas.add(new Artista("Johannes Vermeer",17));
        artistas.add(new Artista("Diego Rivera",18));
        artistas.add(new Artista("Titian",19));
        artistas.add(new Artista("Mark Rothko",20));*/
canciones.add(new Cancion("The Vitruvian Groove",artistas.get(0),0));
canciones.add(new Cancion("La Gioconda Serenade",artistas.get(0),0));
canciones.add(new Cancion("Da Vinci's Notes",artistas.get(0),0));
canciones.add(new Cancion("Whispers of Art",artistas.get(0),0));
canciones.add(new Cancion("Masterpiece Nocturne",artistas.get(0),0));
canciones.add(new Cancion("The Renaissance Waltz",artistas.get(0),0));
canciones.add(new Cancion("Artful Harmony",artistas.get(0),0));
canciones.add(new Cancion("Vinci's Inspiration",artistas.get(0),0));
canciones.add(new Cancion("Canvas of Emotions",artistas.get(0),0));
canciones.add(new Cancion("Brushes of Dreams",artistas.get(0),0));
canciones.add(new Cancion("Night Sky Symphony",artistas.get(1),0));
canciones.add(new Cancion("Starry Starry Night",artistas.get(1),0));
canciones.add(new Cancion("Vincent's Dreams",artistas.get(1),0));
canciones.add(new Cancion("Sunflower Waltz",artistas.get(1),0));
canciones.add(new Cancion("Café Terrace Sonata",artistas.get(1),0));
canciones.add(new Cancion("Irises at Dusk",artistas.get(1),0));
canciones.add(new Cancion("The Eaters' Waltz",artistas.get(1),0));
canciones.add(new Cancion("Wheat Field Nocturne",artistas.get(1),0));
canciones.add(new Cancion("Crow's Melody",artistas.get(1),0));
canciones.add(new Cancion("Blossoms in Moonlight",artistas.get(1),0));
canciones.add(new Cancion("Cubism Sonata",artistas.get(2),0));
canciones.add(new Cancion("Guernica's Echoes",artistas.get(2),0));
canciones.add(new Cancion("Blue Hues Harmony",artistas.get(2),0));
canciones.add(new Cancion("Dance of Demons",artistas.get(2),0));
canciones.add(new Cancion("Palette of Picasso",artistas.get(2),0));
canciones.add(new Cancion("Bullfight Rhapsody",artistas.get(2),0));
canciones.add(new Cancion("Harlequin's Waltz",artistas.get(2),0));
canciones.add(new Cancion("Abstract Rhythms",artistas.get(2),0));
canciones.add(new Cancion("Guitarist's Sketch",artistas.get(2),0));
canciones.add(new Cancion("Portrait of Shapes",artistas.get(2),0));
canciones.add(new Cancion("Leonardo's Legacy",artistas.get(3),0));
canciones.add(new Cancion("Van Gogh's Whispers",artistas.get(3),0));
canciones.add(new Cancion("Canvas of Stars",artistas.get(3),0));
canciones.add(new Cancion("Mysteries of Art",artistas.get(3),0));
canciones.add(new Cancion("The Artistic Journey",artistas.get(3),0));
canciones.add(new Cancion("Brushstrokes of Life",artistas.get(3),0));
canciones.add(new Cancion("Visions Beyond",artistas.get(3),0));
canciones.add(new Cancion("The Painted Dreams",artistas.get(3),0));
canciones.add(new Cancion("Colors of Genius",artistas.get(3),0));
canciones.add(new Cancion("Elegance in Art",artistas.get(3),0));
canciones.add(new Cancion("Starry Nights",artistas.get(4),0));
canciones.add(new Cancion("Flower Power",artistas.get(4),0));
canciones.add(new Cancion("Dali's Dreams",artistas.get(4),0));
canciones.add(new Cancion("Surreal Symphony",artistas.get(4),0));
canciones.add(new Cancion("Melting Time",artistas.get(4),0));
canciones.add(new Cancion("The Persistence Waltz",artistas.get(4),0));
canciones.add(new Cancion("Gala's Ballad",artistas.get(4),0));
canciones.add(new Cancion("The Elephants' Journey",artistas.get(4),0));
canciones.add(new Cancion("Clocks and Shadows",artistas.get(4),0));
canciones.add(new Cancion("Burning Giraffes",artistas.get(4),0));
canciones.add(new Cancion("Frida's Tears",artistas.get(5),0));
canciones.add(new Cancion("Diego's Love",artistas.get(5),0));
canciones.add(new Cancion("Mexican Masterpiece",artistas.get(5),0));
canciones.add(new Cancion("Self-Portrait Serenade",artistas.get(5),0));
canciones.add(new Cancion("Viva La Vida",artistas.get(5),0));
canciones.add(new Cancion("Tropical Tango",artistas.get(5),0));
canciones.add(new Cancion("The Broken Column",artistas.get(5),0));
canciones.add(new Cancion("Unibrow Blues",artistas.get(5),0));
canciones.add(new Cancion("Amor y Dolor",artistas.get(5),0));
canciones.add(new Cancion("Roots and Roses",artistas.get(5),0));
canciones.add(new Cancion("Warhol's Pop",artistas.get(6),0));
canciones.add(new Cancion("Factory of Colors",artistas.get(6),0));
canciones.add(new Cancion("Soup Can Sonata",artistas.get(6),0));
canciones.add(new Cancion("15 Minutes of Fame",artistas.get(6),0));
canciones.add(new Cancion("Andy's Imagination",artistas.get(6),0));
canciones.add(new Cancion("Screenprint Symphony",artistas.get(6),0));
canciones.add(new Cancion("Silver Foil Waltz",artistas.get(6),0));
canciones.add(new Cancion("Celebrity Canvas",artistas.get(6),0));
canciones.add(new Cancion("The Art of Mass Media",artistas.get(6),0));
canciones.add(new Cancion("Warhol's Legacy",artistas.get(6),0));
canciones.add(new Cancion("Water Lilies Waltz",artistas.get(7),0));
canciones.add(new Cancion("Garden of Colors",artistas.get(7),0));
canciones.add(new Cancion("Lily Pond Serenade",artistas.get(7),0));
canciones.add(new Cancion("Claude's Reflections",artistas.get(7),0));
canciones.add(new Cancion("Bridge Over Dreams",artistas.get(7),0));
canciones.add(new Cancion("Monet's Brushstrokes",artistas.get(7),0));
canciones.add(new Cancion("Impressionist Harmony",artistas.get(7),0));
canciones.add(new Cancion("Nymphéas Nocturne",artistas.get(7),0));
canciones.add(new Cancion("Giverny Sonata",artistas.get(7),0));
canciones.add(new Cancion("Art in Bloom",artistas.get(7),0));
canciones.add(new Cancion("O'Keeffe's Abstraction",artistas.get(8),0));
canciones.add(new Cancion("Georgia's Desert Blues",artistas.get(8),0));
canciones.add(new Cancion("Flowers in Close-up",artistas.get(8),0));
canciones.add(new Cancion("Skull and Petals",artistas.get(8),0));
canciones.add(new Cancion("Red Hills Rhapsody",artistas.get(8),0));
canciones.add(new Cancion("Bones and Blooms",artistas.get(8),0));
canciones.add(new Cancion("Pelvis of Imagination",artistas.get(8),0));
canciones.add(new Cancion("Black Iris Waltz",artistas.get(8),0));
canciones.add(new Cancion("Jimson Weed Dreams",artistas.get(8),0));
canciones.add(new Cancion("Modernist Elegy",artistas.get(8),0));
canciones.add(new Cancion("Drip Art Symphony",artistas.get(9),0));
canciones.add(new Cancion("Pollock's Chaos",artistas.get(9),0));
canciones.add(new Cancion("Splatter Serenade",artistas.get(9),0));
canciones.add(new Cancion("Number 5 Tango",artistas.get(9),0));
canciones.add(new Cancion("Abstract Expressions",artistas.get(9),0));
canciones.add(new Cancion("Action Painting Rhapsody",artistas.get(9),0));
canciones.add(new Cancion("Canvas in Motion",artistas.get(9),0));
canciones.add(new Cancion("Painted Revolution",artistas.get(9),0));
canciones.add(new Cancion("Lavender Mist Lullaby",artistas.get(9),0));
canciones.add(new Cancion("The Deep Blue Dive",artistas.get(10),0));
canciones.add(new Cancion("Klimt's Golden Notes",artistas.get(10),0));
canciones.add(new Cancion("The Kiss Waltz",artistas.get(10),0));
canciones.add(new Cancion("Golden Portrait Serenade",artistas.get(10),0));
canciones.add(new Cancion("Tree of Life Melody",artistas.get(10),0));
canciones.add(new Cancion("Secessionist Dreams",artistas.get(10),0));
canciones.add(new Cancion("Vienna's Elegance",artistas.get(10),0));
canciones.add(new Cancion("Judith's Ballad",artistas.get(10),0));
canciones.add(new Cancion("Beethoven Frieze Sonata",artistas.get(10),0));
canciones.add(new Cancion("Adele's Waltz",artistas.get(10),0));
canciones.add(new Cancion("Golden Ages",artistas.get(10),0));
canciones.add(new Cancion("Rembrandt's Shadows",artistas.get(11),0));
canciones.add(new Cancion("Old Masterpiece",artistas.get(11),0));
canciones.add(new Cancion("Dutch Golden Age Serenade",artistas.get(11),0));
canciones.add(new Cancion("Night Watch Waltz",artistas.get(11),0));
canciones.add(new Cancion("Portrait of Amsterdam",artistas.get(11),0));
canciones.add(new Cancion("Light and Shadow Sonata",artistas.get(11),0));
canciones.add(new Cancion("Self-Portrait Symphony",artistas.get(11),0));
canciones.add(new Cancion("Etching Dreams",artistas.get(11),0));
canciones.add(new Cancion("The Anatomy Lesson Ballad",artistas.get(11),0));
canciones.add(new Cancion("Rembrandt's Legacy",artistas.get(11),0));
canciones.add(new Cancion("Magritte's Surreal Notes",artistas.get(12),0));
canciones.add(new Cancion("The Treachery of Images",artistas.get(12),0));
canciones.add(new Cancion("Ceci n'est pas une Chanson",artistas.get(12),0));
canciones.add(new Cancion("Surrealistic Dreamscape",artistas.get(12),0));
canciones.add(new Cancion("The Pipe's Melody",artistas.get(12),0));
canciones.add(new Cancion("The Lovers' Sonata",artistas.get(12),0));
canciones.add(new Cancion("The Empire of Light Waltz",artistas.get(12),0));
canciones.add(new Cancion("This Is Not a Painting",artistas.get(12),0));
canciones.add(new Cancion("The Son of Man Serenade",artistas.get(12),0));
canciones.add(new Cancion("Time Transfixed",artistas.get(12),0));
canciones.add(new Cancion("Munch's Scream Symphony",artistas.get(13),0));
canciones.add(new Cancion("Starry Nightmares",artistas.get(13),0));
canciones.add(new Cancion("Expressionist Elegy",artistas.get(13),0));
canciones.add(new Cancion("The Dance of Despair",artistas.get(13),0));
canciones.add(new Cancion("Anxiety Waltz",artistas.get(13),0));
canciones.add(new Cancion("The Sick Child's Lullaby",artistas.get(13),0));
canciones.add(new Cancion("Jealousy's Notes",artistas.get(13),0));
canciones.add(new Cancion("Melancholia Sonata",artistas.get(13),0));
canciones.add(new Cancion("Vampire's Serenade",artistas.get(13),0));
canciones.add(new Cancion("The Madonna's Whispers",artistas.get(13),0));


for(int i = canciones.size(); i==0;i--){
for(Cancion cancion:canciones){
if(cancion.getArtista().getId()==i){
    System.out.println(cancion.getTitulo());
}
}
}
    }
    
}


