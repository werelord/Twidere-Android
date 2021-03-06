package org.mariotaku.twidere.adapter.iface;

import org.mariotaku.twidere.model.ParcelableStatus;
import org.mariotaku.twidere.util.MediaLoaderWrapper;
import org.mariotaku.twidere.util.MediaLoadingHandler;
import org.mariotaku.twidere.util.TwidereLinkify;
import org.mariotaku.twidere.view.CardMediaContainer.PreviewStyle;
import org.mariotaku.twidere.view.holder.StatusViewHolder.StatusClickListener;

/**
 * Created by mariotaku on 14/11/18.
 */
public interface IStatusesAdapter<Data> extends IContentCardAdapter, StatusClickListener,
        IGapSupportedAdapter, ContentCardClickListener {

    int getLinkHighlightingStyle();

    @PreviewStyle
    int getMediaPreviewStyle();

    ParcelableStatus getStatus(int position);

    long getStatusId(int position);

    int getStatusesCount();

    TwidereLinkify getTwidereLinkify();

    boolean isCardActionsHidden();

    boolean isMediaPreviewEnabled();

    boolean isNameFirst();

    boolean isSensitiveContentEnabled();

    void setData(Data data);

    boolean shouldShowAccountsColor();

    MediaLoadingHandler getMediaLoadingHandler();
}
