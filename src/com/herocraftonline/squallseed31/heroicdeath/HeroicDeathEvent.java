package com.herocraftonline.squallseed31.heroicdeath;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class HeroicDeathEvent extends Event implements Cancellable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -28983074208940338L;
	private DeathCertificate dc;
	private boolean cancel;
	
	private static final HandlerList handlers = new HandlerList();

	@Override
	public HandlerList getHandlers() {
        return handlers;
    }
 
    public static HandlerList getHandlerList() {
        return handlers;
    }

    //////////////////////////////
	
	public HeroicDeathEvent(DeathCertificate dc)
	{
		//super("HeroicDeathEvent");
		this.dc = dc;
		this.cancel = false;
	}

	public DeathCertificate getDeathCertificate() {
		return dc;
	}

	public void setDeathCertificate(DeathCertificate dc) {
		this.dc = dc;
	}
	
	@Override
	public boolean isCancelled() {
		return cancel;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.cancel = cancel;
	}
}
