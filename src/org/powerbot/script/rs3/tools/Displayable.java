package org.powerbot.script.rs3.tools;

/**
 * Denotes something that is displayed as a {@link Component}.
 */
public interface Displayable {
	/**
	 * Retrieves the {@link Component} displaying this object.
	 *
	 * @return the {@link Component} displaying this object
	 */
	public Component getComponent();
}