/*
 * Village Defense - Protect villagers from hordes of zombies
 * Copyright (C) 2019  Plajer's Lair - maintained by Plajer and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package pl.plajer.villagedefense.api.event;

import org.bukkit.event.Event;

import pl.plajer.villagedefense.arena.Arena;

/**
 * Represents Village Defense game related events.
 */
public abstract class VillageEvent extends Event {

  protected Arena arena;

  public VillageEvent(Arena eventArena) {
    arena = eventArena;
  }

  /**
   * Returns event arena
   *
   * @return event arena
   */
  public Arena getArena() {
    return arena;
  }
}
