/*
 * This file is generated by jOOQ.
*/
package com.graphql.example.db.data.tables;


import com.graphql.example.db.data.DefaultSchema;
import com.graphql.example.db.data.Indexes;
import com.graphql.example.db.data.Keys;
import com.graphql.example.db.data.tables.records.PlaylistTrackRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlaylistTrack extends TableImpl<PlaylistTrackRecord> {

    private static final long serialVersionUID = 960813567;

    /**
     * The reference instance of <code>playlist_track</code>
     */
    public static final PlaylistTrack PLAYLIST_TRACK = new PlaylistTrack();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlaylistTrackRecord> getRecordType() {
        return PlaylistTrackRecord.class;
    }

    /**
     * The column <code>playlist_track.PlaylistId</code>.
     */
    public final TableField<PlaylistTrackRecord, Integer> PLAYLISTID = createField("PlaylistId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>playlist_track.TrackId</code>.
     */
    public final TableField<PlaylistTrackRecord, Integer> TRACKID = createField("TrackId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>playlist_track</code> table reference
     */
    public PlaylistTrack() {
        this(DSL.name("playlist_track"), null);
    }

    /**
     * Create an aliased <code>playlist_track</code> table reference
     */
    public PlaylistTrack(String alias) {
        this(DSL.name(alias), PLAYLIST_TRACK);
    }

    /**
     * Create an aliased <code>playlist_track</code> table reference
     */
    public PlaylistTrack(Name alias) {
        this(alias, PLAYLIST_TRACK);
    }

    private PlaylistTrack(Name alias, Table<PlaylistTrackRecord> aliased) {
        this(alias, aliased, null);
    }

    private PlaylistTrack(Name alias, Table<PlaylistTrackRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IFK_PLAYLISTTRACKTRACKID, Indexes.SQLITE_AUTOINDEX_PLAYLIST_TRACK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PlaylistTrackRecord> getPrimaryKey() {
        return Keys.PK_PLAYLIST_TRACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PlaylistTrackRecord>> getKeys() {
        return Arrays.<UniqueKey<PlaylistTrackRecord>>asList(Keys.PK_PLAYLIST_TRACK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PlaylistTrackRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PlaylistTrackRecord, ?>>asList(Keys.FK_PLAYLIST_TRACK_PLAYLISTS_1, Keys.FK_PLAYLIST_TRACK_TRACKS_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlaylistTrack as(String alias) {
        return new PlaylistTrack(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlaylistTrack as(Name alias) {
        return new PlaylistTrack(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PlaylistTrack rename(String name) {
        return new PlaylistTrack(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PlaylistTrack rename(Name name) {
        return new PlaylistTrack(name, null);
    }
}