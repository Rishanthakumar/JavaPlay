package filters;

import play.Logger;
import play.filters.cors.CORSFilter;
import play.http.DefaultHttpFilters;

import javax.inject.Inject;

public class Filters extends DefaultHttpFilters {
    @Inject
    public Filters(CORSFilter corsFilter) {
        super(corsFilter);
        Logger.debug("Filter --->>>>>");
    }
}