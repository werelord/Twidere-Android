/*
 * 				Twidere - Twitter client for Android
 * 
 *  Copyright (C) 2012-2014 Mariotaku Lee <mariotaku.lee@gmail.com>
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mariotaku.twidere.loader.support;

import android.content.Context;

import org.mariotaku.twidere.model.ParcelableUser;

import java.util.List;

import twitter4j.CursorPaging;
import twitter4j.PageableResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;

public class MutesUsersLoader extends CursorSupportUsersLoader {

    public MutesUsersLoader(final Context context, final long accountId, final long cursor,
                            final List<ParcelableUser> data, boolean fromUser) {
        super(context, accountId, cursor, data, fromUser);
    }

    @Override
    protected final PageableResponseList<User> getCursoredUsers(final Twitter twitter, final CursorPaging paging)
            throws TwitterException {
        if (twitter == null) return null;
        return twitter.getMutesUsersList(paging);
    }

}
