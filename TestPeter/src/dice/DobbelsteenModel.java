package dice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

// NOTA BENE: Deze code is niet thread-safe omdat jullie dat in de 1e week nog niet kennen. 
// Zie paragraaf 30.2 voor de thread-safe implementatie.
public class DobbelsteenModel
{
	private int waarde;
	private int aantalWorpen =0;
	private int[] totaalWorpen = new int[6];
	private ArrayList<ActionListener> actionListenerList = new ArrayList<ActionListener>();

	public DobbelsteenModel()
	{
		waarde= (int)(Math.random()*6+1);
	}
	
    public int getWaarde()
    {
        return waarde;
    }    
	public void verhoog()
	{
		waarde++;
	    if (waarde>6) waarde=1;
	    
	    // Merk op dat we de 3e String-parameter van de constructor van de ActionEvent niet invullen.
	    // In dit geval zou je die kunnen gebruiken om de nieuwe dobbelsteenwaarde mee te geven
	    // aan de ActionListener. Dan hoeft de ActionListener niet met e.getSource() weer naar
	    // het model toe te gaan.
	    processEvent( new ActionEvent( this, ActionEvent.ACTION_PERFORMED, null));
	} 
	public void verlaag()
	{
	    waarde--;
	    if (waarde<1) waarde=6;
	    processEvent( new ActionEvent( this, ActionEvent.ACTION_PERFORMED, null));
	}
	public int getAantalWorpen(){
		return aantalWorpen;
	}
	
	public int getTotaalAantalHit(int ogenAantal){
		return totaalWorpen[ogenAantal-1];
	}
	
	public void gooi(){
		aantalWorpen++;
	    waarde= (int)(Math.random()*6+1);
	    totaalWorpen[waarde-1]++;
	    processEvent( new ActionEvent( this, ActionEvent.ACTION_PERFORMED, null));
	}
	
	public void addActionListener( ActionListener l){
		actionListenerList.add( l );
	}

	public void removeActionListener( ActionListener l){
		if ( actionListenerList.contains( l ) )
			actionListenerList.remove( l );
	}
	
	private void processEvent(ActionEvent e){
		// Hieronder gebruiken we het nieuwe Java "foreach" statement. 
		// Lees het als: "for each ActionListener in actionListenerList do ..."
		// Je kunt ook een for-lus of een iterator gebruiken, maar foreach is het elegantste.
		for( ActionListener l : actionListenerList)
			l.actionPerformed( e );
	}
}