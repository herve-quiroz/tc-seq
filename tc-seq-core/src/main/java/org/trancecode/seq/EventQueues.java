/*
 * Copyright (C) 2012 Herve Quiroz
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA 
 */
package org.trancecode.seq;

import com.google.common.base.Preconditions;

/**
 * Utility methods related to {@link EventQueue}.
 * 
 * @author Herve Quiroz
 */
public final class EventQueues
{
    private EventQueues()
    {
        // No instantiation
    }

    public static void checkValidIdentifier(final String identifier)
    {
        Preconditions.checkArgument(identifier.matches("[\\w\\.]+"));
    }

    public static EventQueue multicast(final String identifier, final EventQueue... queues)
    {
        checkValidIdentifier(identifier);
        // TODO
        return null;
    }

    public static EventQueue newEventQueue(final String identifier)
    {
        return newEventQueue(identifier, true);
    }

    public static EventQueue newEventQueue(final String identifier, final boolean ignoreListenerErrors)
    {
        checkValidIdentifier(identifier);
        // TODO
        return null;
    }
}
