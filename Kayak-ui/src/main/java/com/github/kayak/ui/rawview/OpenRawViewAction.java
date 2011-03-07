/**
 * 	This file is part of Kayak.
 *
 *	Kayak is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU Lesser General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *
 *	Kayak is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *
 *	You should have received a copy of the GNU Lesser General Public License
 *	along with Kayak.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.github.kayak.ui.rawview;

import com.github.kayak.core.Bus;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public final class OpenRawViewAction implements ActionListener {

    private final Bus context;

    public OpenRawViewAction(Bus context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        RawViewTopComponent tc = new RawViewTopComponent();
        tc.setBus(context);
        tc.open();
        tc.requestActive();
    }
}